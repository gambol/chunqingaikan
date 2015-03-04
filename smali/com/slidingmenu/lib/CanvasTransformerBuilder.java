package com.slidingmenu.lib; class CanvasTransformerBuilder { void a() { int a;
a=0;// .class public Lcom/slidingmenu/lib/CanvasTransformerBuilder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CanvasTransformerBuilder.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static lin:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     new-instance v0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/CanvasTransformerBuilder$1;);
a=0;//     invoke-direct {v0}, Lcom/slidingmenu/lib/CanvasTransformerBuilder$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder$1;);
a=0;//     sput-object v0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->lin:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 8
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/slidingmenu/lib/CanvasTransformerBuilder;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initTransformer()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 20
a=0;//     new-instance v0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/CanvasTransformerBuilder$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/slidingmenu/lib/CanvasTransformerBuilder$2;-><init>(Lcom/slidingmenu/lib/CanvasTransformerBuilder;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder$2;);
a=0;//     iput-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     .line 23
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public concatTransformer(Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;//     .locals 1
a=0;//     .param p1, "t"    # Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->initTransformer()V
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$6;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/CanvasTransformerBuilder$6;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/slidingmenu/lib/CanvasTransformerBuilder$6;-><init>(Lcom/slidingmenu/lib/CanvasTransformerBuilder;Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder$6;);
a=0;//     iput-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public rotate(IIII)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;//     .locals 6
a=0;//     .param p1, "openedDeg"    # I
a=0;//     .param p2, "closedDeg"    # I
a=0;//     .param p3, "px"    # I
a=0;//     .param p4, "py"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     sget-object v5, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->lin:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->rotate(IIIILandroid/view/animation/Interpolator;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public rotate(IIIILandroid/view/animation/Interpolator;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;//     .locals 7
a=0;//     .param p1, "openedDeg"    # I
a=0;//     .param p2, "closedDeg"    # I
a=0;//     .param p3, "px"    # I
a=0;//     .param p4, "py"    # I
a=0;//     .param p5, "interp"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->initTransformer()V
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder;);
a=0;//     move-object v2, p5
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v6, p4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;-><init>(Lcom/slidingmenu/lib/CanvasTransformerBuilder;Landroid/view/animation/Interpolator;IIII)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder$4;);
a=0;//     iput-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public translate(IIII)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;//     .locals 6
a=0;//     .param p1, "openedX"    # I
a=0;//     .param p2, "closedX"    # I
a=0;//     .param p3, "openedY"    # I
a=0;//     .param p4, "closedY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     sget-object v5, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->lin:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->translate(IIIILandroid/view/animation/Interpolator;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public translate(IIIILandroid/view/animation/Interpolator;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;//     .locals 7
a=0;//     .param p1, "openedX"    # I
a=0;//     .param p2, "closedX"    # I
a=0;//     .param p3, "openedY"    # I
a=0;//     .param p4, "closedY"    # I
a=0;//     .param p5, "interp"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->initTransformer()V
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$5;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/CanvasTransformerBuilder$5;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder;);
a=0;//     move-object v2, p5
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v6, p4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/slidingmenu/lib/CanvasTransformerBuilder$5;-><init>(Lcom/slidingmenu/lib/CanvasTransformerBuilder;Landroid/view/animation/Interpolator;IIII)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder$5;);
a=0;//     iput-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public zoom(IIIIII)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;//     .locals 8
a=0;//     .param p1, "openedX"    # I
a=0;//     .param p2, "closedX"    # I
a=0;//     .param p3, "openedY"    # I
a=0;//     .param p4, "closedY"    # I
a=0;//     .param p5, "px"    # I
a=0;//     .param p6, "py"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     sget-object v7, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->lin:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v6, p6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->zoom(IIIIIILandroid/view/animation/Interpolator;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public zoom(IIIIIILandroid/view/animation/Interpolator;)Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;//     .locals 9
a=0;//     .param p1, "openedX"    # I
a=0;//     .param p2, "closedX"    # I
a=0;//     .param p3, "openedY"    # I
a=0;//     .param p4, "closedY"    # I
a=0;//     .param p5, "px"    # I
a=0;//     .param p6, "py"    # I
a=0;//     .param p7, "interp"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->initTransformer()V
a=0;// 
a=0;//     .line 35
a=0;//     new-instance v0, Lcom/slidingmenu/lib/CanvasTransformerBuilder$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/CanvasTransformerBuilder$3;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder;);
a=0;//     move-object/from16 v2, p7
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v6, p4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v7, p5
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v8, p6
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/slidingmenu/lib/CanvasTransformerBuilder$3;-><init>(Lcom/slidingmenu/lib/CanvasTransformerBuilder;Landroid/view/animation/Interpolator;IIIIII)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CanvasTransformerBuilder$3;);
a=0;//     iput-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CanvasTransformerBuilder;->mTrans:Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
