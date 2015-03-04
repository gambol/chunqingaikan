package com.twocloo.com.cn.beans; class RelativeLayout { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/beans/RelativeLayout;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// .source "RelativeLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/beans/RelativeLayout$RemoveViewsCallBack;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private back:Lcom/twocloo/com/cn/beans/RelativeLayout$RemoveViewsCallBack;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/RelativeLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/RelativeLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/RelativeLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public removeAllViews(Landroid/widget/Button;)V
a=0;//     .locals 2
a=0;//     .param p1, "btn"    # Landroid/widget/Button;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/RelativeLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/beans/RelativeLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 30
a=0;//     .local v0, "childAt":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/RelativeLayout;->back:Lcom/twocloo/com/cn/beans/RelativeLayout$RemoveViewsCallBack;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/RelativeLayout$RemoveViewsCallBack;);
a=0;//     invoke-interface {v1, v0}, Lcom/twocloo/com/cn/beans/RelativeLayout$RemoveViewsCallBack;->removeViews(Landroid/view/View;)V
a=0;// 
a=0;//     .line 32
a=0;//     .end local v0    # "childAt":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/RelativeLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRemoveViewsCallBack(Lcom/twocloo/com/cn/beans/RelativeLayout$RemoveViewsCallBack;)V
a=0;//     .locals 0
a=0;//     .param p1, "back"    # Lcom/twocloo/com/cn/beans/RelativeLayout$RemoveViewsCallBack;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/RelativeLayout;->back:Lcom/twocloo/com/cn/beans/RelativeLayout$RemoveViewsCallBack;
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
}}
