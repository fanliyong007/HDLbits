#include <stdlib.h>
#include <iostream>
#include <verilated.h>
#include <verilated_vcd_c.h>
#include "VVectorgates.h"


#define MAX_SIM_TIME 20//仿真总时钟边沿数
vluint64_t sim_time = 0;//用于计数时钟边沿

int main(int argc, char** argv, char** env) {
    VVectorgates *dut = new VVectorgates;
    //设置波形存储vcd文件
    Verilated::traceEverOn(true);
    VerilatedVcdC *m_trace = new VerilatedVcdC;
    dut->trace(m_trace, 5);
    m_trace->open("waveform.vcd");
    //设置仿真
    while (sim_time < MAX_SIM_TIME) {
        if(sim_time%2==0)
        {
            dut->a ^=0;
            dut->b ^=1 ;
        }
        else
        {
            dut->a ^=1;
            dut->b ^=0;
        }
        dut->eval();
        m_trace->dump(sim_time);
        sim_time++;
    }

    m_trace->close();
    delete dut;
    exit(EXIT_SUCCESS);
}
