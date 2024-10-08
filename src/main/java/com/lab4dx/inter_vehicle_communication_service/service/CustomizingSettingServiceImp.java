package com.lab4dx.inter_vehicle_communication_service.service;

import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import com.lab4dx.inter_vehicle_communication_service.mapper.CustomizingSettingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomizingSettingServiceImp implements CustomizingSettingService {



    private CustomizingSettingMapper customizingSettingMapper;
    @Autowired
    public CustomizingSettingServiceImp(CustomizingSettingMapper customizingSettingMapper) {
        this.customizingSettingMapper = customizingSettingMapper;
    }


    @Override
    public CustomizingSetting getSettingByIdAndMemberId(String customizingId, String memberId) {
        return customizingSettingMapper.getSettingByIdAndMemberId(customizingId, memberId);
    }

    @Override
    public CustomizingSetting getSettingsByMemberAndEmoji(String memberId, String emojiId) {
        return customizingSettingMapper.getSettingByMemberAndEmoji(memberId, emojiId);
    }

    @Override
    public List<CustomizingSetting> getSettingsByMember(String memberId) {
        return customizingSettingMapper.getSettingByMember(memberId);
    }


    @Override
    public void createSettings(CustomizingSetting customizingSetting) {
        customizingSettingMapper.insertSetting(customizingSetting);
    }

    @Override
    public void updateSettings(CustomizingSetting customizingSetting) {
        customizingSettingMapper.updateSetting(customizingSetting);
    }
}
