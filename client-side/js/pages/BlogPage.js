
import '../../css/blogPage.css'
import B1 from '../../images/B1.png'
import B2 from '../../images/B2.png'
import B3 from '../../images/B3.png'
import B4 from '../../images/B4.png'
import B5 from '../../images/B5.png'
import B6 from '../../images/B6.png'
import B7 from '../../images/B7.png'
import B8 from '../../images/B8.png'
import B9 from '../../images/B9.png'
import B10 from '../../images/B10.png'
import B11 from '../../images/B11.png'
import B12 from '../../images/B12.png'

export default function BlogPage() {
    return `
    <div class="blog__container">
<div class="blog_topImg"></div>
<div class="blog__cards">
<img class="blog__img" src="${B1}" alt="" />
<img class="blog__img" src="${B2}" alt="" />
<img class="blog__img" src="${B3}" alt="" />
<img class="blog__img" src="${B4}" alt="" />
<img class="blog__img" src="${B5}" alt="" />
<img class="blog__img" src="${B6}" alt="" />
<img class="blog__img" src="${B7}" alt="" />
<img class="blog__img" src="${B8}" alt="" />
<img class="blog__img" src="${B9}" alt="" />
<img class="blog__img" src="${B10}" alt="" />
<img class="blog__img" src="${B11}" alt="" />
<img class="blog__img" src="${B12}" alt="" />

</div>
</div>
 
    `;
}