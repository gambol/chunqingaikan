package com.twocloooo; class ar { void a() { int a;
a=0;// .class Lcom/twocloooo/ar;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/twocloooo/af;
a=0;// 
a=0;// .field private final synthetic b:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/af;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloooo/ar;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/ar;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/bf;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/af;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/ar;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloooo/af;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloooo/at;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloooo/af;->a(Lcom/twocloooo/af;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/af;->i(Lcom/twocloooo/af;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloooo/af;->j(Lcom/twocloooo/af;)Ljava/lang/Runnable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/af;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     const-string v3, "status"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0, v3}, Lcom/twocloooo/af;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloooo/af;->a(Lcom/twocloooo/af;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloooo/af;->d(Lcom/twocloooo/af;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/twocloooo/af;->a(Lcom/twocloooo/af;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/af;->i(Lcom/twocloooo/af;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloooo/af;->j(Lcom/twocloooo/af;)Ljava/lang/Runnable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloooo/af;->d(Lcom/twocloooo/af;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/af;->i(Lcom/twocloooo/af;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-static {v1}, Lcom/twocloooo/af;->j(Lcom/twocloooo/af;)Ljava/lang/Runnable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/af;);
a=0;//     const-string v2, "user_account"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/twocloooo/af;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     const-string v3, "currency_name"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v3}, Lcom/twocloooo/af;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     const-string v4, "display"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v4}, Lcom/twocloooo/af;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ar;->b:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v3, Lcom/twocloooo/bb;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "true"
a=0;// 
a=0;//     invoke-static {v0, v3, v4}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-ne v1, v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/af;->i(Lcom/twocloooo/af;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloooo/af;->j(Lcom/twocloooo/af;)Ljava/lang/Runnable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Boolean);
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ar;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     sget-object v3, Lcom/twocloooo/bb;->i:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "false"
a=0;// 
a=0;//     invoke-static {v0, v3, v4}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v3, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v3, v0, v1, v2}, Lcom/twocloooo/af;->a(Lcom/twocloooo/af;JLjava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/af;->i(Lcom/twocloooo/af;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ar;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-static {v1}, Lcom/twocloooo/af;->k(Lcom/twocloooo/af;)Ljava/lang/Runnable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
