// import Activity from '../components/Activity';
// import Activity from '../components/Activity';

{/* <input type='hidden' class='instruction' value='${activity.worksheet.title}'/>
<input type='hidden' class='instructionId' value='${activity.worksheet.id}'/> */}

export default function Display() {
    return `
        
        <h1 >Reframing Critical Self Talk</h1>

        <p class='instructions-intro'>Self-criticism can be regarded as the opposite of self-compassion. Whereas self-compassion
        involves a positive and accepting relationship with the self, self-criticism can be construed as
        negative and punishing thoughts directed toward one‘s personal characteristics. Self-criticism
        typically concerns judgment and self-blame regarding shortcomings, such as the inability to
        accomplish personal goals or meet other people’s expectations.</p>

        <p class='instructions-intro'>Self-criticism takes place in different forms. The inner critic (also referred to as the pathological
        critic) threatens (“If you don’t work hard enough, you will lose your job”), monitors weaknesses
        or mistakes (“You messed this up again”), commands (“You should stop acting like a fool”) and
        judges (“You look like a cow in this dress”). Obviously, self-criticism can be quite distressing and
        often results in negative emotions like fear, shame and guilt.</p>
   
        <h2 class='instructions-subheading'>Goal</h2>
        <p>The goal of this exercise is to increase awareness of inner criticism and promote a
        more self-compassionate stance towards the self.</p>
        <h2>Exercise</h2>
        <ul>
            <li>Give your self-critical voices a name, for example, "inner critic" or "inner bully". Such naming can help to personify & increase awareness of your inner criticism, while also creating distance.</li>
            <li>While rephrasing per the last instruction, try rubbing your arm, stroking your hair, giving yourself a massage, or some similar self-loving gesture. This physical gesture of affection may tap into your caring side and release oxytocin, a feel-good hormone.</li>
            <li>If you notice yourself fighting the inner critic, try to gently let go. Replying to your negative inner voice with another negative voice is likely to increase frustration and inner conflict, strengthening the inner critic.</li>
            <li>Identify a trigger to remind yourself to do this awareness exercise. The trigger could be a word, a gesture, a physical reminder (e.g. a picture, quote, etc).</li>
        </ul>
    `;
    // putInstruction(display)
}