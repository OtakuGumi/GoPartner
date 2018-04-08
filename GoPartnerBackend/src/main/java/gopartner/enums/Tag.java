package gopartner.enums;

public enum Tag {
    SHAWSHANK("肖申克的救赎"), INCEPTION("盗梦空间"), FORRESTGUMP("阿甘正传"),
    GODFATHER("教父"), TOTORO("龙猫"), GONEWITHWIND("乱世佳人"),
    STARWARS("星球大战"), JOURNEYTOWEST("大话西游"), IDIOTS("三傻大闹宝莱坞");

    String definition;

    Tag(String definition) {
        this.definition = definition;
    }


}
