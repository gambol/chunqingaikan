package com.twocloo.base.common; class VersionedGestureDetector$FroyoDetector$1 { void a() { int a;
a=0;// .class Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector$1;
a=0;// .super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
a=0;// .source "VersionedGestureDetector.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;-><init>(Landroid/content/Context;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector$1;->this$1:Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;
a=0;// 
a=0;//     .line 154
a=0;//     invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onScale(Landroid/view/ScaleGestureDetector;)Z
a=0;//     .locals 2
a=0;//     .param p1, "detector"    # Landroid/view/ScaleGestureDetector;
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector$1;->this$1:Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;);
a=0;//     iget-object v0, v0, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;->mListener:Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-interface {v0, v1}, Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;->onScale(F)V
a=0;// 
a=0;//     .line 158
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
