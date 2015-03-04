package com.umeng.analytics.game; class c$2 { void a() { int a;
a=0;// .class Lcom/umeng/analytics/game/c$2;
a=0;// .super Lcom/umeng/analytics/f;
a=0;// .source "InternalGameAgent.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/umeng/analytics/game/c;->a(Ljava/lang/String;I)V
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
a=0;// .field private final synthetic c:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/umeng/analytics/game/c;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/umeng/analytics/game/c$2;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/umeng/analytics/game/c$2;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput p3, p0, Lcom/umeng/analytics/game/c$2;->c:I
a=0;// 
a=0;//     .line 115
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/f;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/analytics/game/c$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/umeng/analytics/game/c$2;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/game/c;->a(Lcom/umeng/analytics/game/c;)Lcom/umeng/analytics/game/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/analytics/game/c$2;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/umeng/analytics/game/b;->b(Ljava/lang/String;)Lcom/umeng/analytics/game/b$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 120
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v0}, Lcom/umeng/analytics/game/b$a;->e()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 122
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "level duration is 0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Byte);v3=(LongHi);v4=(Uninit);
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 129
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v3, "level"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/umeng/analytics/game/c$2;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 130
a=0;//     const-string v3, "status"
a=0;// 
a=0;//     iget v4, p0, Lcom/umeng/analytics/game/c$2;->c:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 131
a=0;//     const-string v3, "duration"
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/umeng/analytics/game/c$2;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/game/c;->a(Lcom/umeng/analytics/game/c;)Lcom/umeng/analytics/game/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/umeng/analytics/game/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "user_level"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/analytics/game/c$2;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-static {v1}, Lcom/umeng/analytics/game/c;->a(Lcom/umeng/analytics/game/c;)Lcom/umeng/analytics/game/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/umeng/analytics/game/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/umeng/analytics/game/c$2;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/game/c;->b(Lcom/umeng/analytics/game/c;)Lcom/umeng/analytics/d;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/umeng/analytics/game/c$2;->a:Lcom/umeng/analytics/game/c;
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/analytics/game/c;);
a=0;//     invoke-static {v1}, Lcom/umeng/analytics/game/c;->c(Lcom/umeng/analytics/game/c;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "level"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3, v2}, Lcom/umeng/analytics/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 135
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     const-string v1, "finishLevel(or failLevel) called before startLevel"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
