package com.twocloo.com.cn.utils; class ClickEffectUtils$4 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ClickEffectUtils.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/utils/ClickEffectUtils;->getRelativeListener()Landroid/view/View$OnTouchListener;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final BT_NOT_SELECTED:[F
a=0;// 
a=0;// .field public final BT_SELECTED:[F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     .line 114
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 116
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;);
a=0;//     new-array v0, v1, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;->BT_SELECTED:[F
a=0;// 
a=0;//     .line 117
a=0;//     new-array v0, v1, [F
a=0;// 
a=0;//     fill-array-data v0, :array_1
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;->BT_NOT_SELECTED:[F
a=0;// 
a=0;//     .line 1
a=0;//     return-void
a=0;// 
a=0;//     .line 116
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         -0x3db80000    # -50.0f
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         -0x3db80000    # -50.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         -0x3db80000    # -50.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//     .end array-data
a=0;// 
a=0;//     .line 117
a=0;//     :array_1
a=0;//     .array-data 4
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//         0x0
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/MotionEvent;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/graphics/ColorMatrixColorFilter;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;->BT_SELECTED:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     invoke-direct {v1, v2}, Landroid/graphics/ColorMatrixColorFilter;-><init>([F)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 135
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/graphics/ColorMatrixColorFilter;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/utils/ClickEffectUtils$4;->BT_NOT_SELECTED:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     invoke-direct {v1, v2}, Landroid/graphics/ColorMatrixColorFilter;-><init>([F)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/ColorMatrixColorFilter;);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
a=0;// 
a=0;//     .line 132
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
