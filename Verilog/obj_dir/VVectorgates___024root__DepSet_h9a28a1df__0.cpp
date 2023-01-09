// Verilated -*- C++ -*-
// DESCRIPTION: Verilator output: Design implementation internals
// See VVectorgates.h for the primary calling header

#include "verilated.h"

#include "VVectorgates___024root.h"

VL_INLINE_OPT void VVectorgates___024root___combo__TOP__1(VVectorgates___024root* vlSelf) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root___combo__TOP__1\n"); );
    // Body
    vlSelf->out_or_bitwise = ((IData)(vlSelf->a) | (IData)(vlSelf->b));
    vlSelf->out_or_logical = (1U & (~ ((0U == (IData)(vlSelf->a)) 
                                       & (0U == (IData)(vlSelf->b)))));
    vlSelf->out_not = ((0x38U & ((~ (IData)(vlSelf->b)) 
                                 << 3U)) | (7U & (~ (IData)(vlSelf->a))));
}

void VVectorgates___024root___eval(VVectorgates___024root* vlSelf) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root___eval\n"); );
    // Body
    VVectorgates___024root___combo__TOP__1(vlSelf);
}

#ifdef VL_DEBUG
void VVectorgates___024root___eval_debug_assertions(VVectorgates___024root* vlSelf) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root___eval_debug_assertions\n"); );
    // Body
    if (VL_UNLIKELY((vlSelf->a & 0xf8U))) {
        Verilated::overWidthError("a");}
    if (VL_UNLIKELY((vlSelf->b & 0xf8U))) {
        Verilated::overWidthError("b");}
}
#endif  // VL_DEBUG
