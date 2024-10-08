package com.lab4dx.inter_vehicle_communication_service.mapper;


import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomizingSettingMapperTest {

    @Autowired
    private CustomizingSettingMapper customizingSettingMapper;

    @Test
    void getSettingByMemberAndEmoji() {
    }

    @Test
    void getAllSetting() {
    }

    @Test
    void insertSetting() {
        CustomizingSetting customizingSetting = new CustomizingSetting();
        customizingSetting.setCustomizingId("1");
        customizingSetting.setMemberId("user1");  // 새로운 멤버 ID
        customizingSetting.setEmojiId("1");   // 새로운 이모지 ID
        customizingSetting.setMessage("한국 축구 화이팅");
        customizingSetting.setImagePath("/images/emoji2.png");
        customizingSetting.setEmojiColor("#00FF00");

        customizingSettingMapper.insertSetting(customizingSetting);

        customizingSetting.setCustomizingId("2");
        customizingSetting.setMemberId("user1");  // 새로운 멤버 ID
        customizingSetting.setEmojiId("2");   // 새로운 이모지 ID
        customizingSetting.setMessage("후진 좀 해주세요ㅠㅠ");
        customizingSetting.setImagePath("/images/emoji2.png");
        customizingSetting.setEmojiColor("#00FF00");

        customizingSettingMapper.insertSetting(customizingSetting);

        customizingSetting.setCustomizingId("3");
        customizingSetting.setMemberId("user1");  // 새로운 멤버 ID
        customizingSetting.setEmojiId("3");   // 새로운 이모지 ID
        customizingSetting.setMessage("먼저 가세요");
        customizingSetting.setImagePath("/images/emoji2.png");
        customizingSetting.setEmojiColor("#00FF00");

        customizingSettingMapper.insertSetting(customizingSetting);
    }
//
//    @Test
//    void updateSetting() {
//      String memberId = "qwer";
//        String emojiId = "emoji_02";
//        String emojiColor = "#00FF00";
//
//      customizingSettingMapper.updateIconSetting(emojiId, emojiColor, memberId);
//    }
}

