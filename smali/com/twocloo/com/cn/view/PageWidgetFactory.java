package com.twocloo.com.cn.view; class PageWidgetFactory { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/PageWidgetFactory;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PageWidgetFactory.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/PageWidgetFactory;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static createPageWidget(Landroid/content/Context;II)Lcom/twocloo/com/cn/view/PageWidget;
a=0;//     .locals 1
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     sget-object v0, Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;->horizontal:Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;);
a=0;//     invoke-static {p0, p1, p2, v0}, Lcom/twocloo/com/cn/view/PageWidgetFactory;->createPageWidget(Landroid/content/Context;IILcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;)Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static createPageWidget(Landroid/content/Context;IILcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;)Lcom/twocloo/com/cn/view/PageWidget;
a=0;//     .locals 1
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;//     .param p3, "type"    # Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     sget-object v0, Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;->real:Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;);
a=0;//     invoke-virtual {v0, p3}, Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/RealPageWidget;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/RealPageWidget;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/twocloo/com/cn/view/RealPageWidget;-><init>(Landroid/content/Context;II)V
a=0;// 
a=0;//     .line 30
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 27
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;->horizontal:Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;);
a=0;//     invoke-virtual {v0, p3}, Lcom/twocloo/com/cn/view/PageWidgetFactory$PageWidgetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/XPageWidget;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/XPageWidget;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/twocloo/com/cn/view/XPageWidget;-><init>(Landroid/content/Context;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/XPageWidget;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 30
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/XPageWidget;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/XPageWidget;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/twocloo/com/cn/view/XPageWidget;-><init>(Landroid/content/Context;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/XPageWidget;);
a=0;//     goto :goto_0
a=0;// .end method
}}
