import Activity from '../components/Activity';

export default function Form(form) {
    return `
        <input type='hidden' class='worksheet' value='${activity.worksheet.title}' />
        <input type='hidden' class='numberQA' value='4'/>
        <h1>Strengths Spotting By Exception Finding</h1>
        <h2 class='question1'>Was there a time when this problem was not a problem, or when it presented itself with less severity?</h2>
        <input type='text' class='answer1' placeholder='' /> 
        <h2 class='question2'>What was it like at that time?</h2>
        <input type='text' class='answer2' placeholder='' /> 
        <h2 class='question3'>What were you doing instead at that time?</h2>
        <input type='text' class='answer3' placeholder='' />
        <h2 class='question4'>If you have faced this problem before, have you successfully overcome it before? If so, what do you suppose you did to make that happen?</h2>
        <input type='text' class='answer4' placeholder='' />
        <input type='submit' class='submit' />
    `;
}