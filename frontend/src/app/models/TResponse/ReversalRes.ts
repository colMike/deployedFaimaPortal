import { GenericResponse } from './../GenericResponse';
import { Reversal } from '../Reversal';
export interface ReversalRes extends GenericResponse{
    result: Reversal[]
}