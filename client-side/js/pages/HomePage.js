import '../../css/home_page.css'
import HRLogoHeart from '../../images/hr-logo-heart.png'
import HRLogoLong from '../../images/hr-logo-long.png'
import SS1 from '../../images/top-slideShow-1.jpg'
import SS2 from '../../images/top-slideShow-2.jpg'
import SS3 from '../../images/top-slideShow-3.jpg'
import SS4 from '../../images/test-4.jpg'
import SS5 from '../../images/top-slideShow-4.jpg'
import SS6 from '../../images/top-slideShow-5.jpg'
import SS7 from '../../images/top-slideShow-6.jpg'
import SS8 from '../../images/top-slideShow-7.jpg'
import SS9 from '../../images/top-slideShow-8.jpg'
import SS10 from '../../images/test-5.jpg'
import SS11 from '../../images/top-slideShow-9.jpg'
import SS12 from '../../images/top-slideShow-10.jpg'
import Test1 from '../../images/test-1.jpg'
import Test2 from '../../images/test-2.jpg'
import Test3 from '../../images/test-3.jpg'
import Article from '../../images/article-1.jpg'
import MemberS from '../../images/member-spotlight.jpg'
import ReviewScene from '../../images/review-1.jpg'
import VHSLogoBlack from '../../images/vhs-logo-black.png'
import InspirationalQuote from '../components/InspirationalQuote'

export default function HomePage() {
  return `
 <div id="slideshow" class="slideshow" data-component="slideshow">
  <div role="list">
    <div class="slideShowGrid">
        <img class="SS1" src="${SS1}" alt=""/>
        <img class="SS2" src="${SS2}" alt=""/>
        <img class="SS3" src="${SS3}" alt=""/>
        </div>
        <div class="slideShowGrid">
        <img class="SS1" src="${SS7}" alt=""/>
        <img class="SS2" src="${SS8}" alt=""/>
        <img class="SS3" src="${SS9}" alt=""/>
        </div>
        </div>
        </div>
        <div class="inspirational_quote__container"></div>

        <div class="testGrid">
        <img class="T1" src="${Test1}" alt="" />
        <div class="boxText T2">
        <h3 class="down">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc maximus, nulla ut commodo sagittis, sapien dui mattis dui, non pulvinar lorem felis nec erat</h3>
        <button class="assessmentButton">TAKE THE ASSESSMENT</button>
        </div>
        </div>

    `;
}
