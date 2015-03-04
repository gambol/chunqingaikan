package com.handmark.pulltorefresh.library.internal; class Utils { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/internal/Utils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Utils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final LOG_TAG:Ljava/lang/String; = "PullToRefresh"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 5
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/internal/Utils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static warnDeprecation(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "depreacted"    # Ljava/lang/String;
a=0;//     .param p1, "replacement"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     const-string v0, "PullToRefresh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "You\'re using the deprecated "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " attr, please switch over to "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 11
a=0;//     return-void
a=0;// .end method
}}
