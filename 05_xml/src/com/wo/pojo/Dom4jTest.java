package com.wo.pojo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.lang.Double.parseDouble;


/**
 * 演示 dom4j 的使用
 * 操作 xml 文件
 */
public class Dom4jTest {


    /**
     * 获取 document 对象
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read("src\\books.xml");

        System.out.println(document);
    }


    /**
     * 读取 books.xml 文件生成 book 类
     */
    @Test
    public void test2() throws DocumentException {

        // 1. 读取 books.xml 文件
        SAXReader reader = new SAXReader();
        // 在 JUnit 测试中, 相对路径是从模块开始算的
        Document document = reader.read("src\\books.xml");
        // 2. 通过 document 对象获取根元素
        Element rootElement = document.getRootElement();
        // System.out.println(rootElement); // books
        // 3. 通过 根元素 获取 book 标签对象
        List<Element> books = rootElement.elements("book");
        // 4. 遍历, 处理每个 book 标签转换为 Book 类
        for (Element book : books) {
            // book.asXML();// 把标签对象, 转换为标签字符串
            Element nameElement = book.element("name");
            String nameText = nameElement.getText();
            // getText 获取标签对象中的文本内容
            String priceText = book.elementText("price");
            // elementText 直接获取标签中的内容
            String authorText = book.elementText("author");
            System.out.println(new Books(book.attributeValue("sn"), nameText, parseDouble(priceText) ,authorText));
        }

    }


}
