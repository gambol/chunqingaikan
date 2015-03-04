package com.twocloooo; class ai { void a() { int a;
a=0;// .class Lcom/twocloooo/ai;
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
a=0;// .field private final synthetic c:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic d:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic e:Lcom/twocloooo/GetOnlineParamsListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/af;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/twocloooo/GetOnlineParamsListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloooo/ai;->b:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloooo/ai;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloooo/ai;->d:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/twocloooo/ai;->e:Lcom/twocloooo/GetOnlineParamsListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/ai;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/af;->i(Lcom/twocloooo/af;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/twocloooo/aj;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloooo/aj;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/ai;->e:Lcom/twocloooo/GetOnlineParamsListener;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/GetOnlineParamsListener;);
a=0;//     invoke-direct {v1, p0, v2, p1}, Lcom/twocloooo/aj;-><init>(Lcom/twocloooo/ai;Lcom/twocloooo/GetOnlineParamsListener;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/aj;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v2, 0x1388
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     iget-object v0, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/af;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloooo/af;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "&p_key="
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/twocloooo/bf;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0, v2, v2}, Lcom/twocloooo/at;->a(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
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
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/af;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloooo/af;->a(Lcom/twocloooo/af;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ai;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/ai;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloooo/bc;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/twocloooo/ai;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/af;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
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
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloooo/af;->d(Lcom/twocloooo/af;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/twocloooo/af;->a(Lcom/twocloooo/af;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ai;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/ai;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloooo/bc;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/twocloooo/ai;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
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
a=0;//     iget-object v0, p0, Lcom/twocloooo/ai;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/ai;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloooo/bc;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/twocloooo/ai;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/af;);
a=0;//     const-string v2, "p_value"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/twocloooo/af;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_4
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
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/ai;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/ai;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloooo/bc;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/twocloooo/ai;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloooo/ai;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/ai;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Lcom/twocloooo/bc;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/twocloooo/ai;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
