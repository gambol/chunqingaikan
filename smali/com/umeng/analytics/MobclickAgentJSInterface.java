package com.umeng.analytics; class MobclickAgentJSInterface { void a() { int a;
a=0;// .class public Lcom/umeng/analytics/MobclickAgentJSInterface;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MobclickAgentJSInterface.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/umeng/analytics/MobclickAgentJSInterface$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/webkit/WebView;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/umeng/analytics/MobclickAgentJSInterface;);
a=0;//     iput-object p1, p0, Lcom/umeng/analytics/MobclickAgentJSInterface;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 25
a=0;//     invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 26
a=0;//     new-instance v0, Lcom/umeng/analytics/MobclickAgentJSInterface$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/analytics/MobclickAgentJSInterface$a;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/umeng/analytics/MobclickAgentJSInterface$a;-><init>(Lcom/umeng/analytics/MobclickAgentJSInterface;Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/MobclickAgentJSInterface$a;);
a=0;//     invoke-virtual {p2, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/webkit/WebView;Landroid/webkit/WebChromeClient;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/umeng/analytics/MobclickAgentJSInterface;);
a=0;//     iput-object p1, p0, Lcom/umeng/analytics/MobclickAgentJSInterface;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v0, Lcom/umeng/analytics/MobclickAgentJSInterface$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/analytics/MobclickAgentJSInterface$a;);
a=0;//     invoke-direct {v0, p0, p3}, Lcom/umeng/analytics/MobclickAgentJSInterface$a;-><init>(Lcom/umeng/analytics/MobclickAgentJSInterface;Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/MobclickAgentJSInterface$a;);
a=0;//     invoke-virtual {p2, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/umeng/analytics/MobclickAgentJSInterface;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     iget-object v0, p0, Lcom/umeng/analytics/MobclickAgentJSInterface;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
}}
