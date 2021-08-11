import '../../css/home_page.css'
import HRLogoHeart from '../../images/hr-logo-heart.png'
import HRLogoLong from '../../images/hr-logo-long.png'
import Test1 from '../../images/test-1.jpg'
import Test2 from '../../images/test-2.jpg'
import Test3 from '../../images/test-3.jpg'
import Article from '../../images/article-1.jpg'
import MemberS from '../../images/member-spotlight.jpg'
import VHSLogoBlack from '../../images/vhs-logo-black.png'


export default function HomePage() {
  return `
  <div class="home__container">
  <div class="topImg"><div>
        <div class="inspoQuote">
        <img class="quote" src="" alt=""/>
        </div>
        <div class="testGrid">
        <img class="T1" src="${Test1}" alt="" />
        <div class="boxText T2">
        <h3 class="down">WE ARE HERE FOR YOU! TAKING A MOMENT TO REFLECT ON YOUR FEELINGS CAN HELP YOU CUT THROUGH MENTAL CLUTTER TO RECOGNIZE THE ROOT OF YOUR FRUSTRATIONS. TAKE A MINUTE TO GO THROUGH OUR QUICK ASSESSMENT. IT MAY BE THE FIRST STEP TO FEELING BETTER.</h3>
        <button class="assessmentButton">TAKE THE ASSESSMENT</button>
        </div>
        </div>
        <div class="text middle">
        <h2>YOUR FIRST STEP TO FEELING BETTER </h2>
        </div>
        <div class="articleGrid">
        <div class="boxText A1">
        <h3 class="down">THERE ARE TIMES WHEN WE NEED ASSISTANCE WITH OUR THOUGHT PROCESSES. HEALTHY RESPONSE IS HERE TO GUIDE YOU THOUGH PROMPTS AND EXERCISES CATERED TO HELPING YOU FINDING NEW WAYS TO REACT TO UNWELCOME CIRCUMSTANCES. </h3>
        <button class="articleButton">WEEKLY ASSIGNMENTS</button>
        </div>
        <img class="A2" src="${Article}" alt="" />
        </div>
        <div class="text bottom">
        <h2> WE ARE MORE ALIKE THAN DIFFERENT - JOIN OUR COMMUNITY OF HEALTHY RESPONDERS!</h2>
        </div>
        <div class="memberGrid">
        <img class="M1" src="${MemberS}" alt="" />
        <div class="boxText M2">
        <h3 class="down">BOGGED DOWN WITH SHAME AND ANGER, JULIAN ALMOST LOST EVERYTHING HE HELD DEAR.  READ HOW HE RELEARNED TO ADDRESS DIFFICULTIES. IT CHANGED HIS LIFE AND MADE ROOM FOR EVERYTHING HE EVER HOPED.</h3>
        <button class="memberButton">MEMBER SPOTLIGHT</button>
        </div>
        </div>
        <div class="text bottom">
        <h2>IT GETS BETTER - YOU ARE NOT ALONE – TOGETHER WE CAN HEAL</h2>
        </div>
        </div>

    `;
}
