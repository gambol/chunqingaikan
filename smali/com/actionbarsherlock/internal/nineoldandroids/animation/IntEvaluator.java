package com.actionbarsherlock.internal.nineoldandroids.animation; class IntEvaluator { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntEvaluator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IntEvaluator.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator",
a=0;//         "<",
a=0;//         "Ljava/lang/Integer;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntEvaluator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public evaluate(FLjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
a=0;//     .locals 3
a=0;//     .param p1, "fraction"    # F
a=0;//     .param p2, "startValue"    # Ljava/lang/Integer;
a=0;//     .param p3, "endValue"    # Ljava/lang/Integer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "startInt":I
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v2, v0
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v2, p1
a=0;// 
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Ljava/lang/Integer;
a=0;// 
a=0;//     check-cast p3, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntEvaluator;->evaluate(FLjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
}}
