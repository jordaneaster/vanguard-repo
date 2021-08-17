import Instruction from '../components/Instruction';

export default function InstructionPage(instruction) {
    console.log('hi from instruction page');
    console.log(instruction);
    return `
        ${Instruction(instruction)}
    `;
}