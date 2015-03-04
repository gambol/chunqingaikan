package com.twocloo.com.cn.view; class ProgressWebView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/ProgressWebView;
a=0;// .super Landroid/webkit/WebView;
a=0;// .source "ProgressWebView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/view/ProgressWebView$WebChromeClient;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private progressbar:Landroid/widget/ProgressBar;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/ProgressWebView;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/ProgressWebView$WebChromeClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/ProgressWebView$WebChromeClient;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/view/ProgressWebView$WebChromeClient;-><init>(Lcom/twocloo/com/cn/view/ProgressWebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/ProgressWebView$WebChromeClient;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/ProgressWebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onScrollChanged(IIII)V
a=0;//     .locals 2
a=0;//     .param p1, "l"    # I
a=0;//     .param p2, "t"    # I
a=0;//     .param p3, "oldl"    # I
a=0;//     .param p4, "oldt"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/ProgressWebView;->progressbar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ProgressBar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/widget/AbsoluteLayout$LayoutParams;
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "lp":Landroid/widget/AbsoluteLayout$LayoutParams;
a=0;//     iput p1, v0, Landroid/widget/AbsoluteLayout$LayoutParams;->x:I
a=0;// 
a=0;//     .line 37
a=0;//     iput p2, v0, Landroid/widget/AbsoluteLayout$LayoutParams;->y:I
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/ProgressWebView;->progressbar:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebView;->onScrollChanged(IIII)V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
}}
