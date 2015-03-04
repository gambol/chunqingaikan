package com.nineoldandroids.animation; class PreHoneycombCompat$12 { void a() { int a;
a=0;// .class Lcom/nineoldandroids/animation/PreHoneycombCompat$12;
a=0;// .super Lcom/nineoldandroids/util/IntProperty;
a=0;// .source "PreHoneycombCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/nineoldandroids/animation/PreHoneycombCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/nineoldandroids/util/IntProperty",
a=0;//         "<",
a=0;//         "Landroid/view/View;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "$anonymous0"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     invoke-direct {p0, p1}, Lcom/nineoldandroids/util/IntProperty;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PreHoneycombCompat$12;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Landroid/view/View;)Ljava/lang/Integer;
a=0;//     .locals 1
a=0;//     .param p1, "object"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$12;->get(Landroid/view/View;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setValue(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;//     .param p1, "object"    # Landroid/view/View;
a=0;//     .param p2, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/view/animation/AnimatorProxy;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScrollY(I)V
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setValue(Ljava/lang/Object;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/nineoldandroids/animation/PreHoneycombCompat$12;->setValue(Landroid/view/View;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
