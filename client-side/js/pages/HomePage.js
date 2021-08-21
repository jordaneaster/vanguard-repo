import "../../css/home_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
import VHSLogo from "../../images/vhs-logo-black.png";
import Profile from "../../images/1.png";
import Assessment from "../../images/2.png";
import Activities from "../../images/3.png";
import Messages from "../../images/4.png";
import MessageBoard from "../../images/5.png";
import Appointment from "../../images/6.png";
import Resources from "../../images/7.png";
import MemberSpotlight from "../../images/8.png";
import HRBlog from "../../images/9.png";
import HRHeart from "../../images/HR-Logo-Home.png"

export default function HomePage() {
  return `
  <div class="home__container">
 <img class="home__HR_logo" src="${HRLogoLong}">
        <div class="inspirational_quote__container"></div>
        <div class="up"></div>
        <div class="home__card">
        <img class="home_card_img" id="profileCard" src="${Profile}">
        <img class="home_card_img round" id="assessment" src="${Assessment}">
        <img class="home_card_img" id="activities" src="${Activities}">
        <img class="home_card_img" id="messages" src="${Messages}">
        <img class="home_card_img" id="responses" src="${HRHeart}">
        <img class="home_card_img" id="messageBoard" src="${MessageBoard}">
        <img class="home_card_img" id="appointment" src="${Appointment}">
        <img class="home_card_img round" id="resources" src="${Resources}">
        <img class="home_card_img round" id="memberSpotlight" src="${MemberSpotlight}">
        <img class="home_card_img" id="blog" src="${HRBlog}">
        <input type='hidden' class='filler'></input>
        </div>
        </div>
    `;
}
