package com.icangqu.share.web.controller;

import com.icangqu.share.constant.RequestConstant;
import com.icangqu.share.model.dto.CqShareLabelDto;
import com.icangqu.share.service.CqShareLabelService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
@Controller
@RequestMapping(value = "/l", produces = RequestConstant.CONTROLLER_PRODUCES)
public class CqSharePublishController extends CqBaseController {

    private static final Log LOGGER = LogFactory.getLog(CqSharePublishController.class);

    @Resource(name = "cqShareLabelService")
    CqShareLabelService shareLabelService;

    @RequestMapping(value = "/lbl-shareLabel", method = RequestMethod.GET)
    public ModelAndView shareLabel(@RequestParam String shareId) {
        ModelAndView mv = new ModelAndView("sharePublish");
        CqShareLabelDto dto = shareLabelService.getShareLabelDetailByShareID(shareId);
        mv.addObject("d", dto);
        return mv;
    }

}
