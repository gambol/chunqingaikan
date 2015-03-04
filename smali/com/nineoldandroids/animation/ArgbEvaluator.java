package com.nineoldandroids.animation; class ArgbEvaluator { void a() { int a;
a=0;// .class public Lcom/nineoldandroids/animation/ArgbEvaluator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ArgbEvaluator.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/ArgbEvaluator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 12
a=0;//     .param p1, "fraction"    # F
a=0;//     .param p2, "startValue"    # Ljava/lang/Object;
a=0;//     .param p3, "endValue"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     check-cast p2, Ljava/lang/Integer;
a=0;// 
a=0;//     .end local p2    # "startValue":Ljava/lang/Object;
a=0;//     invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 43
a=0;//     .local v8, "startInt":I
a=0;//     #v8=(Integer);
a=0;//     shr-int/lit8 v5, v8, 0x18
a=0;// 
a=0;//     .line 44
a=0;//     .local v5, "startA":I
a=0;//     #v5=(Byte);
a=0;//     shr-int/lit8 v10, v8, 0x10
a=0;// 
a=0;//     #v10=(Short);
a=0;//     and-int/lit16 v9, v10, 0xff
a=0;// 
a=0;//     .line 45
a=0;//     .local v9, "startR":I
a=0;//     #v9=(Integer);
a=0;//     shr-int/lit8 v10, v8, 0x8
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     and-int/lit16 v7, v10, 0xff
a=0;// 
a=0;//     .line 46
a=0;//     .local v7, "startG":I
a=0;//     #v7=(Integer);
a=0;//     and-int/lit16 v6, v8, 0xff
a=0;// 
a=0;//     .line 48
a=0;//     .local v6, "startB":I
a=0;//     #v6=(Integer);
a=0;//     check-cast p3, Ljava/lang/Integer;
a=0;// 
a=0;//     .end local p3    # "endValue":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 49
a=0;//     .local v3, "endInt":I
a=0;//     #v3=(Integer);
a=0;//     shr-int/lit8 v0, v3, 0x18
a=0;// 
a=0;//     .line 50
a=0;//     .local v0, "endA":I
a=0;//     #v0=(Byte);
a=0;//     shr-int/lit8 v10, v3, 0x10
a=0;// 
a=0;//     #v10=(Short);
a=0;//     and-int/lit16 v4, v10, 0xff
a=0;// 
a=0;//     .line 51
a=0;//     .local v4, "endR":I
a=0;//     #v4=(Integer);
a=0;//     shr-int/lit8 v10, v3, 0x8
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     and-int/lit16 v2, v10, 0xff
a=0;// 
a=0;//     .line 52
a=0;//     .local v2, "endG":I
a=0;//     #v2=(Integer);
a=0;//     and-int/lit16 v1, v3, 0xff
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "endB":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v10, v0, v5
a=0;// 
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v10, p1
a=0;// 
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v10, v5
a=0;// 
a=0;//     shl-int/lit8 v10, v10, 0x18
a=0;// 
a=0;//     .line 55
a=0;//     sub-int v11, v4, v9
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     int-to-float v11, v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     mul-float/2addr v11, p1
a=0;// 
a=0;//     float-to-int v11, v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/2addr v11, v9
a=0;// 
a=0;//     shl-int/lit8 v11, v11, 0x10
a=0;// 
a=0;//     .line 54
a=0;//     or-int/2addr v10, v11
a=0;// 
a=0;//     .line 56
a=0;//     sub-int v11, v2, v7
a=0;// 
a=0;//     int-to-float v11, v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     mul-float/2addr v11, p1
a=0;// 
a=0;//     float-to-int v11, v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/2addr v11, v7
a=0;// 
a=0;//     shl-int/lit8 v11, v11, 0x8
a=0;// 
a=0;//     .line 54
a=0;//     or-int/2addr v10, v11
a=0;// 
a=0;//     .line 57
a=0;//     sub-int v11, v1, v6
a=0;// 
a=0;//     int-to-float v11, v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     mul-float/2addr v11, p1
a=0;// 
a=0;//     float-to-int v11, v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/2addr v11, v6
a=0;// 
a=0;//     .line 54
a=0;//     or-int/2addr v10, v11
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v10
a=0;// .end method
}}
