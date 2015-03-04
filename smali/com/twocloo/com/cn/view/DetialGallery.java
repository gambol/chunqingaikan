package com.twocloo.com.cn.view; class DetialGallery { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/DetialGallery;
a=0;// .super Landroid/widget/Gallery;
a=0;// .source "DetialGallery.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrSet"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/Gallery;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/DetialGallery;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private isScrollingLeft(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 2
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "velocityX"    # F
a=0;//     .param p4, "velocityY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/view/DetialGallery;->isScrollingLeft(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 22
a=0;//     const/16 v0, 0x15
a=0;// 
a=0;//     .line 27
a=0;//     .local v0, "kEvent":I
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/view/DetialGallery;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     .line 28
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     return v1
a=0;// 
a=0;//     .line 25
a=0;//     .end local v0    # "kEvent":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     const/16 v0, 0x16
a=0;// 
a=0;//     .restart local v0    # "kEvent":I
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
}}
