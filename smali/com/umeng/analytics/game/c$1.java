package com.umeng.analytics.game; class c$1 { void a() { int a;
a=0;// .class Lcom/umeng/analytics/game/c$1;
a=0;// .super Lcom/umeng/analytics/f;
a=0;// .source "InternalGameAgent.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/umeng/analytics/game/c;->b(Ljava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;// .field private final synthetic b:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/umeng/analytics/game/c;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/umeng/analytics/game/c$1;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/umeng/analytics/game/c$1;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 93
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/f;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/analytics/game/c$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcom/umeng/analytics/game/c$1;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/game/c;->a(Lcom/umeng/analytics/game/c;)Lcom/umeng/analytics/game/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/analytics/game/c$1;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/umeng/analytics/game/b;->a(Ljava/lang/String;)Lcom/umeng/analytics/game/b$a;
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "level"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/analytics/game/c$1;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 101
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v1, p0, Lcom/umeng/analytics/game/c$1;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/analytics/game/c;->a(Lcom/umeng/analytics/game/c;)Lcom/umeng/analytics/game/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/umeng/analytics/game/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "user_level"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/analytics/game/c$1;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/analytics/game/c;->a(Lcom/umeng/analytics/game/c;)Lcom/umeng/analytics/game/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v2, v2, Lcom/umeng/analytics/game/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/umeng/analytics/game/c$1;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/umeng/analytics/game/c;->b(Lcom/umeng/analytics/game/c;)Lcom/umeng/analytics/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/umeng/analytics/game/c$1;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/analytics/game/c;->c(Lcom/umeng/analytics/game/c;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "level"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3, v0}, Lcom/umeng/analytics/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)V
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
}}
