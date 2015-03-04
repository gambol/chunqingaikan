package com.actionbarsherlock.internal.nineoldandroids.animation; class FloatEvaluator { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatEvaluator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FloatEvaluator.java"
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
a=0;//         "Ljava/lang/Number;",
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
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatEvaluator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public evaluate(FLjava/lang/Number;Ljava/lang/Number;)Ljava/lang/Float;
a=0;//     .locals 2
a=0;//     .param p1, "fraction"    # F
a=0;//     .param p2, "startValue"    # Ljava/lang/Number;
a=0;//     .param p3, "endValue"    # Ljava/lang/Number;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "startFloat":F
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v1, v0
a=0;// 
a=0;//     mul-float/2addr v1, p1
a=0;// 
a=0;//     add-float/2addr v1, v0
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Float;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Ljava/lang/Number;
a=0;// 
a=0;//     check-cast p3, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatEvaluator;->evaluate(FLjava/lang/Number;Ljava/lang/Number;)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Float;);
a=0;//     return-object v0
a=0;// .end method
}}
