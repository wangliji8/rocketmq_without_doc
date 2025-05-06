package org.apache.rocketmq.test.client.mq;

import java.util.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // 初始化一个 HashMap 来存储省市名称和简称
        Map<String, String> provinceMap = new HashMap<>();

        // 省市名称和简称字符串
        String provinces = "北京(京)、上海(沪)、天津(津)、重庆(渝)、河北(冀)、河南(豫)、云南(云)、"
                + "辽宁(辽)、黑龙江(黑)、湖南(湘)、安徽(皖)、山东(鲁)、新疆(新)、"
                + "江苏(苏)、浙江(浙)、江西(赣)、湖北(鄂)、广西(桂)、甘肃(甘)、"
                + "山西(晋)、内蒙古(蒙)、陕西(陕)、吉林(吉)、福建(闽)、贵州(贵)、"
                + "广东(粤)、青海(青)、西藏(藏)、海南(琼)、宁夏(宁)、四川(川)、"
                + "香港(港)、澳门(澳)";

        // 分割字符串
        String[] provincesArray = provinces.split("、");

        // 遍历数组并填充 Map
        for (String province : provincesArray) {
            // 去掉字符串中的括号
            String[] parts = province.split("\\(");
            String name = parts[0]; // 省市名称
            String abbreviation = parts[1].replace(")", ""); // 省市简称

            // 将省市名称和简称放入 Map
//            if (name.indexOf(abbreviation) != -1) {
//                continue;
//            }
            provinceMap.put(name, abbreviation);
        }
        // 获取 Map 的条目集并转为列表
        List<Map.Entry<String, String>> entries = new ArrayList<>(provinceMap.entrySet());
        // 打印 Map 内容
        while (true) {
            Collections.shuffle(entries);
            // 遍历打乱后的列表并打印
            for (Map.Entry<String, String> entry : entries) {
                System.out.println();
                System.out.print("                                                           " + entry.getValue());
//                System.out.print("                                                           " + entry.getKey());
                Thread.sleep(1300); // 等待 2.5 秒

                System.out.print("        " + entry.getKey());
//                System.out.print("        " + entry.getValue());
                Thread.sleep(500); // 等待 1 秒
            }
        }
    }
}

