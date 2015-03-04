package com.slidingmenu.lib; class SlidingMenu { void a() { int a;
a=0;// .class public Lcom/slidingmenu/lib/SlidingMenu;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// .source "SlidingMenu.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;,
a=0;//         Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;,
a=0;//         Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;,
a=0;//         Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;,
a=0;//         Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;,
a=0;//         Lcom/slidingmenu/lib/SlidingMenu$SavedState;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final LEFT:I = 0x0
a=0;// 
a=0;// .field public static final LEFT_RIGHT:I = 0x2
a=0;// 
a=0;// .field public static final RIGHT:I = 0x1
a=0;// 
a=0;// .field public static final SLIDING_CONTENT:I = 0x1
a=0;// 
a=0;// .field public static final SLIDING_WINDOW:I = 0x0
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "SlidingMenu"
a=0;// 
a=0;// .field public static final TOUCHMODE_FULLSCREEN:I = 0x1
a=0;// 
a=0;// .field public static final TOUCHMODE_MARGIN:I = 0x0
a=0;// 
a=0;// .field public static final TOUCHMODE_NONE:I = 0x2
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActionbarOverlay:Z
a=0;// 
a=0;// .field private mCloseListener:Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mOpenListener:Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;
a=0;// 
a=0;// .field private mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;// .field private mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;I)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "slideStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/slidingmenu/lib/SlidingMenu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 180
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/slidingmenu/lib/SlidingMenu;->attachToActivity(Landroid/app/Activity;I)V
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/slidingmenu/lib/SlidingMenu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 170
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/slidingmenu/lib/SlidingMenu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 191
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 22
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     invoke-direct/range {p0 .. p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     iput-boolean v0, v1, Lcom/slidingmenu/lib/SlidingMenu;->mActionbarOverlay:Z
a=0;// 
a=0;//     .line 969
a=0;//     new-instance v20, Landroid/os/Handler;
a=0;// 
a=0;//     #v20=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct/range {v20 .. v20}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v20=(Reference,Landroid/os/Handler;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/slidingmenu/lib/SlidingMenu;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 203
a=0;//     new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     const/16 v21, -0x1
a=0;// 
a=0;//     #v21=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {v4, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 204
a=0;//     .local v4, "behindParams":Landroid/widget/RelativeLayout$LayoutParams;
a=0;//     #v4=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     new-instance v20, Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v20=(UninitRef,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/slidingmenu/lib/CustomViewBehind;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);v20=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     .line 205
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/slidingmenu/lib/SlidingMenu;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 206
a=0;//     new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     const/16 v21, -0x1
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {v3, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 207
a=0;//     .local v3, "aboveParams":Landroid/widget/RelativeLayout$LayoutParams;
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     new-instance v20, Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v20=(UninitRef,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);v20=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     .line 208
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/slidingmenu/lib/SlidingMenu;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 210
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual/range {v20 .. v21}, Lcom/slidingmenu/lib/CustomViewAbove;->setCustomViewBehind(Lcom/slidingmenu/lib/CustomViewBehind;)V
a=0;// 
a=0;//     .line 211
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v21}, Lcom/slidingmenu/lib/CustomViewBehind;->setCustomViewAbove(Lcom/slidingmenu/lib/CustomViewAbove;)V
a=0;// 
a=0;//     .line 212
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     new-instance v21, Lcom/slidingmenu/lib/SlidingMenu$1;
a=0;// 
a=0;//     #v21=(UninitRef,Lcom/slidingmenu/lib/SlidingMenu$1;);
a=0;//     invoke-direct/range {v21 .. v22}, Lcom/slidingmenu/lib/SlidingMenu$1;-><init>(Lcom/slidingmenu/lib/SlidingMenu;)V
a=0;// 
a=0;//     #v21=(Reference,Lcom/slidingmenu/lib/SlidingMenu$1;);
a=0;//     invoke-virtual/range {v20 .. v21}, Lcom/slidingmenu/lib/CustomViewAbove;->setOnPageChangeListener(Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;)V
a=0;// 
a=0;//     .line 229
a=0;//     sget-object v20, Lcom/slidingmenu/lib/R$styleable;->SlidingMenu:[I
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     move-object/from16 v2, v20
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 231
a=0;//     .local v14, "ta":Landroid/content/res/TypedArray;
a=0;//     #v14=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 232
a=0;//     .local v7, "mode":I
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v7}, Lcom/slidingmenu/lib/SlidingMenu;->setMode(I)V
a=0;// 
a=0;//     .line 233
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     const/16 v21, -0x1
a=0;// 
a=0;//     #v21=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(One);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 234
a=0;//     .local v17, "viewAbove":I
a=0;//     #v17=(Integer);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/SlidingMenu;->setContent(I)V
a=0;// 
a=0;//     .line 239
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v20=(Conflicted);
a=0;//     const/16 v20, 0x2
a=0;// 
a=0;//     #v20=(PosByte);
a=0;//     const/16 v21, -0x1
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 240
a=0;//     .local v18, "viewBehind":I
a=0;//     #v18=(Integer);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 241
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/SlidingMenu;->setMenu(I)V
a=0;// 
a=0;//     .line 245
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v20=(Conflicted);
a=0;//     const/16 v20, 0x6
a=0;// 
a=0;//     #v20=(PosByte);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 246
a=0;//     .local v15, "touchModeAbove":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v15}, Lcom/slidingmenu/lib/SlidingMenu;->setTouchModeAbove(I)V
a=0;// 
a=0;//     .line 247
a=0;//     const/16 v20, 0x7
a=0;// 
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 248
a=0;//     .local v16, "touchModeBehind":I
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/SlidingMenu;->setTouchModeBehind(I)V
a=0;// 
a=0;//     .line 250
a=0;//     const/16 v20, 0x3
a=0;// 
a=0;//     const/high16 v21, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v8, v0
a=0;// 
a=0;//     .line 251
a=0;//     .local v8, "offsetBehind":I
a=0;//     #v8=(Integer);
a=0;//     const/16 v20, 0x4
a=0;// 
a=0;//     #v20=(PosByte);
a=0;//     const/high16 v21, -0x40800000    # -1.0f
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     .line 252
a=0;//     .local v19, "widthBehind":I
a=0;//     #v19=(Integer);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v8, v0, :cond_2
a=0;// 
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_2
a=0;// 
a=0;//     .line 253
a=0;//     new-instance v20, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v20=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v21, "Cannot set both behindOffset and behindWidth for a SlidingMenu"
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v20 .. v21}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v20
a=0;// 
a=0;//     .line 237
a=0;//     .end local v8    # "offsetBehind":I
a=0;//     .end local v15    # "touchModeAbove":I
a=0;//     .end local v16    # "touchModeBehind":I
a=0;//     .end local v18    # "viewBehind":I
a=0;//     .end local v19    # "widthBehind":I
a=0;//     :cond_0
a=0;//     #v8=(Uninit);v15=(Uninit);v16=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Byte);v21=(Byte);
a=0;//     new-instance v20, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v20=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);v20=(Reference,Landroid/widget/FrameLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/SlidingMenu;->setContent(Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     .restart local v18    # "viewBehind":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Byte);v18=(Integer);v20=(Byte);
a=0;//     new-instance v20, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v20=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);v20=(Reference,Landroid/widget/FrameLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/SlidingMenu;->setMenu(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 254
a=0;//     .restart local v8    # "offsetBehind":I
a=0;//     .restart local v15    # "touchModeAbove":I
a=0;//     .restart local v16    # "touchModeBehind":I
a=0;//     .restart local v19    # "widthBehind":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v8=(Integer);v15=(Integer);v16=(Integer);v19=(Integer);v20=(Byte);v21=(Integer);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v8, v0, :cond_5
a=0;// 
a=0;//     .line 255
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v8}, Lcom/slidingmenu/lib/SlidingMenu;->setBehindOffset(I)V
a=0;// 
a=0;//     .line 260
a=0;//     :goto_2
a=0;//     const/16 v20, 0x5
a=0;// 
a=0;//     #v20=(PosByte);
a=0;//     const v21, 0x3ea8f5c3    # 0.33f
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 261
a=0;//     .local v9, "scrollOffsetBehind":F
a=0;//     #v9=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v9}, Lcom/slidingmenu/lib/SlidingMenu;->setBehindScrollScale(F)V
a=0;// 
a=0;//     .line 262
a=0;//     const/16 v20, 0x8
a=0;// 
a=0;//     const/16 v21, -0x1
a=0;// 
a=0;//     #v21=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 263
a=0;//     .local v12, "shadowRes":I
a=0;//     #v12=(Integer);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v12, v0, :cond_3
a=0;// 
a=0;//     .line 264
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v12}, Lcom/slidingmenu/lib/SlidingMenu;->setShadowDrawable(I)V
a=0;// 
a=0;//     .line 266
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v20, 0x9
a=0;// 
a=0;//     #v20=(PosByte);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v13, v0
a=0;// 
a=0;//     .line 267
a=0;//     .local v13, "shadowWidth":I
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v13}, Lcom/slidingmenu/lib/SlidingMenu;->setShadowWidth(I)V
a=0;// 
a=0;//     .line 268
a=0;//     const/16 v20, 0xa
a=0;// 
a=0;//     #v20=(PosByte);
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 269
a=0;//     .local v6, "fadeEnabled":Z
a=0;//     #v6=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v6}, Lcom/slidingmenu/lib/SlidingMenu;->setFadeEnabled(Z)V
a=0;// 
a=0;//     .line 270
a=0;//     const/16 v20, 0xb
a=0;// 
a=0;//     const v21, 0x3ea8f5c3    # 0.33f
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 271
a=0;//     .local v5, "fadeDeg":F
a=0;//     #v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v5}, Lcom/slidingmenu/lib/SlidingMenu;->setFadeDegree(F)V
a=0;// 
a=0;//     .line 272
a=0;//     const/16 v20, 0xc
a=0;// 
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 273
a=0;//     .local v10, "selectorEnabled":Z
a=0;//     #v10=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v10}, Lcom/slidingmenu/lib/SlidingMenu;->setSelectorEnabled(Z)V
a=0;// 
a=0;//     .line 274
a=0;//     const/16 v20, 0xd
a=0;// 
a=0;//     const/16 v21, -0x1
a=0;// 
a=0;//     #v21=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 275
a=0;//     .local v11, "selectorRes":I
a=0;//     #v11=(Integer);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v11, v0, :cond_4
a=0;// 
a=0;//     .line 276
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0, v11}, Lcom/slidingmenu/lib/SlidingMenu;->setSelectorDrawable(I)V
a=0;// 
a=0;//     .line 277
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v14}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 278
a=0;//     return-void
a=0;// 
a=0;//     .line 256
a=0;//     .end local v5    # "fadeDeg":F
a=0;//     .end local v6    # "fadeEnabled":Z
a=0;//     .end local v9    # "scrollOffsetBehind":F
a=0;//     .end local v10    # "selectorEnabled":Z
a=0;//     .end local v11    # "selectorRes":I
a=0;//     .end local v12    # "shadowRes":I
a=0;//     .end local v13    # "shadowWidth":I
a=0;//     :cond_5
a=0;//     #v0=(Byte);v1=(Integer);v5=(Uninit);v6=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v21=(Integer);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_6
a=0;// 
a=0;//     .line 257
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/SlidingMenu;->setBehindWidth(I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 259
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Byte);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/SlidingMenu;->setBehindOffset(I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/slidingmenu/lib/SlidingMenu;)Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mOpenListener:Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/slidingmenu/lib/SlidingMenu;)Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mCloseListener:Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addIgnoredView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 836
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->addIgnoredView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 837
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public attachToActivity(Landroid/app/Activity;I)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "slideStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/slidingmenu/lib/SlidingMenu;->attachToActivity(Landroid/app/Activity;IZ)V
a=0;// 
a=0;//     .line 288
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public attachToActivity(Landroid/app/Activity;IZ)V
a=0;//     .locals 10
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "slideStyle"    # I
a=0;//     .param p3, "actionbarOverlay"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 298
a=0;//     #v9=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     if-eq p2, v7, :cond_0
a=0;// 
a=0;//     .line 299
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v7, "slideStyle must be either SLIDING_WINDOW or SLIDING_CONTENT"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     #v6=(Uninit);v7=(One);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 302
a=0;//     new-instance v6, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v7, "This SlidingMenu appears to already be attached"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 305
a=0;//     :cond_1
a=0;//     #v7=(One);
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     new-array v7, v7, [I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     const v8, 0x1010054
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aput v8, v7, v9
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 306
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v9, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 307
a=0;//     .local v1, "background":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 309
a=0;//     packed-switch p2, :pswitch_data_0
a=0;// 
a=0;//     .line 333
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 311
a=0;//     :pswitch_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iput-boolean v9, p0, Lcom/slidingmenu/lib/SlidingMenu;->mActionbarOverlay:Z
a=0;// 
a=0;//     .line 312
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 313
a=0;//     .local v4, "decor":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {v4, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 315
a=0;//     .local v5, "decorChild":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 317
a=0;//     invoke-virtual {v4, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 318
a=0;//     invoke-virtual {p0, v5}, Lcom/slidingmenu/lib/SlidingMenu;->setContent(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 321
a=0;//     .end local v4    # "decor":Landroid/view/ViewGroup;
a=0;//     .end local v5    # "decorChild":Landroid/view/ViewGroup;
a=0;//     :pswitch_1
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     iput-boolean p3, p0, Lcom/slidingmenu/lib/SlidingMenu;->mActionbarOverlay:Z
a=0;// 
a=0;//     .line 323
a=0;//     const v6, 0x1020002
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p1, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 324
a=0;//     .local v3, "contentParent":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 325
a=0;//     .local v2, "content":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 326
a=0;//     invoke-virtual {v3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 327
a=0;//     invoke-virtual {p0, v2}, Lcom/slidingmenu/lib/SlidingMenu;->setContent(Landroid/view/View;)V
a=0;// 
a=0;//     .line 329
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 330
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 309
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public clearIgnoredViews()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 852
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewAbove;->clearIgnoredViews()V
a=0;// 
a=0;//     .line 853
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected fitSystemWindows(Landroid/graphics/Rect;)Z
a=0;//     .locals 6
a=0;//     .param p1, "insets"    # Landroid/graphics/Rect;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 958
a=0;//     iget v1, p1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 959
a=0;//     .local v1, "leftPadding":I
a=0;//     #v1=(Integer);
a=0;//     iget v2, p1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 960
a=0;//     .local v2, "rightPadding":I
a=0;//     #v2=(Integer);
a=0;//     iget v3, p1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 961
a=0;//     .local v3, "topPadding":I
a=0;//     #v3=(Integer);
a=0;//     iget v0, p1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 962
a=0;//     .local v0, "bottomPadding":I
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v4, p0, Lcom/slidingmenu/lib/SlidingMenu;->mActionbarOverlay:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 963
a=0;//     const-string v4, "SlidingMenu"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "setting padding!"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 964
a=0;//     invoke-virtual {p0, v1, v3, v2, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setPadding(IIII)V
a=0;// 
a=0;//     .line 966
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     return v4
a=0;// .end method
a=0;// 
a=0;// .method public getBehindOffset()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 569
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewBehind;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getBehindScrollScale()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 656
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewBehind;->getScrollScale()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getContent()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 360
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewAbove;->getContent()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenu()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewBehind;->getContent()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 453
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewBehind;->getMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSecondaryMenu()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewBehind;->getSecondaryContent()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTouchModeAbove()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 686
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewAbove;->getTouchMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isMenuShowing()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 551
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewAbove;->getCurrentItem()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewAbove;->getCurrentItem()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isSecondaryMenuShowing()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 560
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewAbove;->getCurrentItem()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isSlidingEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 434
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewAbove;->isSlidingEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public manageLayers(F)V
a=0;//     .locals 4
a=0;//     .param p1, "percentOpen"    # F
a=0;//     .annotation build Landroid/annotation/TargetApi;
a=0;//         value = 0xb
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 973
a=0;//     #v1=(Null);
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 990
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(PosByte);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 975
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Integer);v3=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     cmpl-float v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_3
a=0;// 
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 976
a=0;//     .local v0, "layer":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 978
a=0;//     .local v1, "layerType":I
a=0;//     :cond_2
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContent()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLayerType()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 979
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/SlidingMenu;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v3, Lcom/slidingmenu/lib/SlidingMenu$2;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/slidingmenu/lib/SlidingMenu$2;);
a=0;//     invoke-direct {v3, p0, v1}, Lcom/slidingmenu/lib/SlidingMenu$2;-><init>(Lcom/slidingmenu/lib/SlidingMenu;I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/slidingmenu/lib/SlidingMenu$2;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "layer":Z
a=0;//     .end local v1    # "layerType":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Null);v2=(Byte);v3=(PosByte);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 975
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 3
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 947
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Lcom/slidingmenu/lib/SlidingMenu$SavedState;
a=0;// 
a=0;//     .line 948
a=0;//     .local v0, "ss":Lcom/slidingmenu/lib/SlidingMenu$SavedState;
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v1}, Landroid/widget/RelativeLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 949
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu$SavedState;->getItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 950
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 937
a=0;//     invoke-super {p0}, Landroid/widget/RelativeLayout;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 938
a=0;//     .local v1, "superState":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v0, Lcom/slidingmenu/lib/SlidingMenu$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/SlidingMenu$SavedState;);
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v2=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v2}, Lcom/slidingmenu/lib/CustomViewAbove;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/slidingmenu/lib/SlidingMenu$SavedState;-><init>(Landroid/os/Parcelable;I)V
a=0;// 
a=0;//     .line 939
a=0;//     .local v0, "ss":Lcom/slidingmenu/lib/SlidingMenu$SavedState;
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$SavedState;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public removeIgnoredView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 845
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->removeIgnoredView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 846
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAboveOffset(I)V
a=0;//     .locals 1
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 603
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->setAboveOffset(I)V
a=0;// 
a=0;//     .line 604
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAboveOffsetRes(I)V
a=0;//     .locals 2
a=0;//     .param p1, "resID"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 612
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v0, v1
a=0;// 
a=0;//     .line 613
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setAboveOffset(I)V
a=0;// 
a=0;//     .line 614
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBehindCanvasTransformer(Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;)V
a=0;//     .locals 1
a=0;//     .param p1, "t"    # Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 677
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setCanvasTransformer(Lcom/slidingmenu/lib/SlidingMenu$CanvasTransformer;)V
a=0;// 
a=0;//     .line 678
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBehindOffset(I)V
a=0;//     .locals 1
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 583
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setWidthOffset(I)V
a=0;// 
a=0;//     .line 584
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBehindOffsetRes(I)V
a=0;//     .locals 2
a=0;//     .param p1, "resID"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 593
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v0, v1
a=0;// 
a=0;//     .line 594
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setBehindOffset(I)V
a=0;// 
a=0;//     .line 595
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBehindScrollScale(F)V
a=0;//     .locals 2
a=0;//     .param p1, "f"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 666
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmpg-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 667
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "ScrollScale must be between 0 and 1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 668
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setScrollScale(F)V
a=0;// 
a=0;//     .line 669
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBehindWidth(I)V
a=0;//     .locals 9
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 624
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     const-string v8, "window"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Landroid/view/WindowManager;
a=0;// 
a=0;//     .line 625
a=0;//     invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 627
a=0;//     .local v1, "display":Landroid/view/Display;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/view/Display;);
a=0;//     const-class v0, Landroid/view/Display;
a=0;// 
a=0;//     .line 628
a=0;//     .local v0, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v5, v7, [Ljava/lang/Class;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const-class v8, Landroid/graphics/Point;
a=0;// 
a=0;//     aput-object v8, v5, v7
a=0;// 
a=0;//     .line 629
a=0;//     .local v5, "parameterTypes":[Ljava/lang/Class;
a=0;//     new-instance v4, Landroid/graphics/Point;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Point;);
a=0;//     invoke-direct {v4}, Landroid/graphics/Point;-><init>()V
a=0;// 
a=0;//     .line 630
a=0;//     .local v4, "parameter":Landroid/graphics/Point;
a=0;//     #v4=(Reference,Landroid/graphics/Point;);
a=0;//     const-string v7, "getSize"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 631
a=0;//     .local v3, "method":Ljava/lang/reflect/Method;
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object v4, v7, v8
a=0;// 
a=0;//     invoke-virtual {v3, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 632
a=0;//     iget v6, v4, Landroid/graphics/Point;->x:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 636
a=0;//     .end local v0    # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v3    # "method":Ljava/lang/reflect/Method;
a=0;//     .end local v4    # "parameter":Landroid/graphics/Point;
a=0;//     .end local v5    # "parameterTypes":[Ljava/lang/Class;
a=0;//     .local v6, "width":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Reference,Ujava/lang/Object;);
a=0;//     sub-int v7, v6, p1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/slidingmenu/lib/SlidingMenu;->setBehindOffset(I)V
a=0;// 
a=0;//     .line 637
a=0;//     return-void
a=0;// 
a=0;//     .line 633
a=0;//     .end local v6    # "width":I
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v6=(Uninit);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 634
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .restart local v6    # "width":I
a=0;//     #v6=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setBehindWidthRes(I)V
a=0;//     .locals 2
a=0;//     .param p1, "res"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 646
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v0, v1
a=0;// 
a=0;//     .line 647
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setBehindWidth(I)V
a=0;// 
a=0;//     .line 648
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContent(I)V
a=0;//     .locals 2
a=0;//     .param p1, "res"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 342
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setContent(Landroid/view/View;)V
a=0;// 
a=0;//     .line 343
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContent(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 351
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->setContent(Landroid/view/View;)V
a=0;// 
a=0;//     .line 352
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->showContent()V
a=0;// 
a=0;//     .line 353
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFadeDegree(F)V
a=0;//     .locals 1
a=0;//     .param p1, "f"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 791
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setFadeDegree(F)V
a=0;// 
a=0;//     .line 792
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFadeEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 781
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setFadeEnabled(Z)V
a=0;// 
a=0;//     .line 782
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMenu(I)V
a=0;//     .locals 2
a=0;//     .param p1, "res"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 370
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setMenu(Landroid/view/View;)V
a=0;// 
a=0;//     .line 371
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMenu(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 379
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setContent(Landroid/view/View;)V
a=0;// 
a=0;//     .line 380
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMode(I)V
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 443
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 445
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setMode(I)V
a=0;// 
a=0;//     .line 446
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnCloseListener(Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 872
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/SlidingMenu;->mCloseListener:Lcom/slidingmenu/lib/SlidingMenu$OnCloseListener;
a=0;// 
a=0;//     .line 873
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnClosedListener(Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 890
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->setOnClosedListener(Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;)V
a=0;// 
a=0;//     .line 891
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnOpenListener(Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 862
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/SlidingMenu;->mOpenListener:Lcom/slidingmenu/lib/SlidingMenu$OnOpenListener;
a=0;// 
a=0;//     .line 863
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnOpenedListener(Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 881
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->setOnOpenedListener(Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;)V
a=0;// 
a=0;//     .line 882
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSecondaryMenu(I)V
a=0;//     .locals 2
a=0;//     .param p1, "res"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 397
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setSecondaryMenu(Landroid/view/View;)V
a=0;// 
a=0;//     .line 398
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSecondaryMenu(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 406
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setSecondaryContent(Landroid/view/View;)V
a=0;// 
a=0;//     .line 408
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSecondaryShadowDrawable(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 745
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setSecondaryShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 746
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSecondaryShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 754
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setSecondaryShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 755
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelectedView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 809
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setSelectedView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 810
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelectorBitmap(Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;//     .param p1, "b"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 827
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setSelectorBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 828
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelectorDrawable(I)V
a=0;//     .locals 2
a=0;//     .param p1, "res"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 818
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-static {v1, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/CustomViewBehind;->setSelectorBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 819
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelectorEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 800
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/CustomViewBehind;->setSelectorEnabled(Z)V
a=0;// 
a=0;//     .line 801
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowDrawable(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 728
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 736
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 737
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowWidth(I)V
a=0;//     .locals 1
a=0;//     .param p1, "pixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 772
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setShadowWidth(I)V
a=0;// 
a=0;//     .line 773
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowWidthRes(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 763
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setShadowWidth(I)V
a=0;// 
a=0;//     .line 764
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSlidingEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->setSlidingEnabled(Z)V
a=0;// 
a=0;//     .line 426
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStatic(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 462
a=0;//     #v2=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 463
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->setSlidingEnabled(Z)V
a=0;// 
a=0;//     .line 464
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->setCustomViewBehind(Lcom/slidingmenu/lib/CustomViewBehind;)V
a=0;// 
a=0;//     .line 465
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 473
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     return-void
a=0;// 
a=0;//     .line 468
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 470
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->setCustomViewBehind(Lcom/slidingmenu/lib/CustomViewBehind;)V
a=0;// 
a=0;//     .line 471
a=0;//     invoke-virtual {p0, v2}, Lcom/slidingmenu/lib/SlidingMenu;->setSlidingEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTouchModeAbove(I)V
a=0;//     .locals 2
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 697
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 698
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 699
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 702
a=0;//     :cond_0
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->setTouchMode(I)V
a=0;// 
a=0;//     .line 703
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTouchModeBehind(I)V
a=0;//     .locals 2
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 714
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 715
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 718
a=0;//     :cond_0
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v0, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->setTouchMode(I)V
a=0;// 
a=0;//     .line 719
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showContent()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 513
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->showContent(Z)V
a=0;// 
a=0;//     .line 514
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showContent(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 523
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showMenu()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->showMenu(Z)V
a=0;// 
a=0;//     .line 480
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showMenu(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 488
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 489
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showSecondaryMenu()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 496
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->showSecondaryMenu(Z)V
a=0;// 
a=0;//     .line 497
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showSecondaryMenu(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/SlidingMenu;->mViewAbove:Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 507
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toggle()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 529
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/SlidingMenu;->toggle(Z)V
a=0;// 
a=0;//     .line 530
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toggle(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/SlidingMenu;->isMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 539
a=0;//     invoke-virtual {p0, p1}, Lcom/slidingmenu/lib/SlidingMenu;->showContent(Z)V
a=0;// 
a=0;//     .line 543
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 541
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1}, Lcom/slidingmenu/lib/SlidingMenu;->showMenu(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
