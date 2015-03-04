package cn.waps; class bj { void a() { int a;
a=0;// .class Lcn/waps/bj;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/waps/bh;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/bh;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/bj;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bh;);
a=0;//     invoke-static {v0}, Lcn/waps/bh;->b(Lcn/waps/bh;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     sget-boolean v0, Lcn/waps/AppConnect;->n:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bh;);
a=0;//     iget-object v0, v0, Lcn/waps/bh;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AppConnect;->initAdInfo()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcn/waps/AppConnect;->i:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcn/waps/AppConnect;->i:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bh;);
a=0;//     iget-object v0, v0, Lcn/waps/bh;->e:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->hasWindowFocus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bh;);
a=0;//     invoke-static {v0}, Lcn/waps/bh;->c(Lcn/waps/bh;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bh;->d(Lcn/waps/bh;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcn/waps/bh;->a()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bh;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcn/waps/bh;->a(Lcn/waps/bh;I)I
a=0;// 
a=0;//     sget-object v0, Lcn/waps/AppConnect;->i:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lcn/waps/bh;->b(I)I
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bh;);
a=0;//     iget-object v1, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/bh;);
a=0;//     invoke-static {v1}, Lcn/waps/bh;->d(Lcn/waps/bh;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcn/waps/bh;->b(Lcn/waps/bh;I)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-static {}, Lcn/waps/bh;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     const-wide/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcn/waps/bj;->sleep(J)V
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bh;);
a=0;//     iget-object v0, v0, Lcn/waps/bh;->e:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/bj;->a:Lcn/waps/bh;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bh;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcn/waps/bh;->a(Lcn/waps/bh;Z)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_1
a=0;//     #v0=(Integer);
a=0;//     sget v0, Lcn/waps/bh;->g:I
a=0;// 
a=0;//     mul-int/lit16 v0, v0, 0x3e8
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcn/waps/bj;->sleep(J)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
