package com.icangqu.share.web.controller;

import com.icangqu.share.constant.RequestConstant;
import com.icangqu.share.model.dto.CqShareLabelDto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
@Controller
@RequestMapping(value = "/l", produces = RequestConstant.CONTROLLER_PRODUCES)
public class CqShareLabelController extends CqBaseController  {

    private static final Log LOGGER = LogFactory.getLog(CqShareLabelController.class);

    @RequestMapping(value = "/lbl-shareLabel", method = RequestMethod.GET)
    public ModelAndView shareLabel(@RequestParam String shareId) {
        ModelAndView mv = new ModelAndView("shareLabel");
        //TODO
        CqShareLabelDto dto = new CqShareLabelDto();
        dto.setCreatorName("中午");
        mv.addObject("dto",dto);
        return mv;
    }

}
