// import Activity from './Activity';
import Display from '../activity-instructions/ReframingCriticalSelfTalk';
import apiActions from '../api-actions/api-actions';




// export default function Instruction(instruction, displayUrl) {
export default function Instruction(instruction) {
// export default function Instruction(displayUrl) {
    console.log('hi from instruction.js');
    // console.log(instruction);
    // console.log(displayUrl);
    // putInstructionFromDisplay(instruction);
    return `
        ${ getDisplay() }
    `;
}

function getDisplay() {
    return `
        ${ Display() }
    `;
}

// function putDisplayToInstruction(worksheet) {
//     const display = Display(worksheet.);
//     apiActions.putRequest(
//         ''
//     )
// }