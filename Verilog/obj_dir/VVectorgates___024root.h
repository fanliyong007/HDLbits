// Verilated -*- C++ -*-
// DESCRIPTION: Verilator output: Design internal header
// See VVectorgates.h for the primary calling header

#ifndef VERILATED_VVECTORGATES___024ROOT_H_
#define VERILATED_VVECTORGATES___024ROOT_H_  // guard

#include "verilated.h"

class VVectorgates__Syms;
VL_MODULE(VVectorgates___024root) {
  public:

    // DESIGN SPECIFIC STATE
    VL_IN8(a,2,0);
    VL_IN8(b,2,0);
    VL_OUT8(out_or_bitwise,2,0);
    VL_OUT8(out_or_logical,0,0);
    VL_OUT8(out_not,5,0);

    // INTERNAL VARIABLES
    VVectorgates__Syms* vlSymsp;  // Symbol table

    // CONSTRUCTORS
    VVectorgates___024root(const char* name);
    ~VVectorgates___024root();
    VL_UNCOPYABLE(VVectorgates___024root);

    // INTERNAL METHODS
    void __Vconfigure(VVectorgates__Syms* symsp, bool first);
} VL_ATTR_ALIGNED(VL_CACHE_LINE_BYTES);


#endif  // guard
