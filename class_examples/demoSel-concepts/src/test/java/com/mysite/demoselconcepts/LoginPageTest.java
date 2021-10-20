package com.mysite.demoselconcepts;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class LoginPageTest {

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://in.yahoo.com/");
        //https://login.yahoo.com/;_ylt=AwrxywI11G9h2TUAYm.6HAx.?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin
    }

    //testing login to yahoo.com
    //@Test
    public void login(){
        $("#ysignin").click();
        $("#login-username").sendKeys("itasworkshop", Keys.ENTER);
        $("#login-passwd").sendKeys("Viron@123",Keys.ENTER);
        $("#ysignout > div.text.user.fl-l.ml-7").shouldHave(Condition.text("itasworkshop"));
    }

    @Test
    public void getUnreadEmailCount() throws InterruptedException {
        $("#ysignin").click();
        $("#login-username").sendKeys("itasworkshop", Keys.ENTER);
        $("#login-passwd").sendKeys("******",Keys.ENTER);
        $("#ymail > div").click();

        //$("#app > div.I_ZnwrMC.D_F.em_N.o_h.W_6D6F.H_6D6F > div > div.a_3rehn.W_3o4BO.s_3o4BO.cZ10Gnkk_ZM1sUU.D_F.ek_BB.em_0 > nav > div > div.Y_fq7.P_Z1jXKuU.D_B.iz_A.iy_h.it_68UO > div.folder-list.p_R.k_w.W_6D6F.U_3mS2U > ul > li:nth-child(1) > div > a > span.E_fq7.T_eDQ > span").shouldBe(Condition.attribute("visible"), Duration.ofSeconds(60));
        //$x("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a/span[2]/span").shouldBe(Condition.attribute("visible"), Duration.ofSeconds(60));
        String emailsNum = $x("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a/span[2]/span").getOwnText();
        System.out.println(emailsNum);
    }
}
