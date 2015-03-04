package cn.waps; class br { void a() { int a;
a=0;// .class Lcn/waps/br;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/webkit/DownloadListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic b:Landroid/app/Dialog;
a=0;// 
a=0;// .field final synthetic c:Lcn/waps/bp;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/bp;Landroid/content/Context;Landroid/app/Dialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/br;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/br;->b:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/br;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bp;);
a=0;//     invoke-static {v0}, Lcn/waps/bp;->b(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/br;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcn/waps/bp;->a()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     const-string v2, "wrong_url"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/br;->a:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bp;);
a=0;//     invoke-static {v0}, Lcn/waps/bp;->c(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bp;);
a=0;//     new-instance v1, Lcn/waps/aq;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/aq;);
a=0;//     iget-object v2, p0, Lcn/waps/br;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/bp;);
a=0;//     invoke-static {v3}, Lcn/waps/bp;->b(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/bp;);
a=0;//     invoke-static {v4}, Lcn/waps/bp;->d(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v5=(Reference,Lcn/waps/bp;);
a=0;//     invoke-static {v5}, Lcn/waps/bp;->c(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v4, v5}, Lcn/waps/aq;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/aq;);
a=0;//     iput-object v1, v0, Lcn/waps/bp;->a:Lcn/waps/aq;
a=0;// 
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/br;->b:Landroid/app/Dialog;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/br;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/waps/bs;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/bs;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/bs;-><init>(Lcn/waps/br;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/bs;);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/AppConnect;->a(Lcn/waps/cq;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/br;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     iget-object v2, v2, Lcn/waps/bp;->a:Lcn/waps/aq;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/bp;->b(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     invoke-static {v4}, Lcn/waps/bp;->d(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v5=(Reference,Lcn/waps/bp;);
a=0;//     invoke-static {v5}, Lcn/waps/bp;->c(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static/range {v0 .. v5}, Lcn/waps/bp;->a(Lcn/waps/bp;Landroid/content/Context;Lcn/waps/aq;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/waps/bp;->a(Lcn/waps/bp;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bp;);
a=0;//     new-instance v1, Lcn/waps/aq;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/aq;);
a=0;//     iget-object v2, p0, Lcn/waps/br;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/bp;);
a=0;//     invoke-static {v3}, Lcn/waps/bp;->b(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/br;->c:Lcn/waps/bp;
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/bp;);
a=0;//     invoke-static {v4}, Lcn/waps/bp;->d(Lcn/waps/bp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v4}, Lcn/waps/aq;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/aq;);
a=0;//     iput-object v1, v0, Lcn/waps/bp;->a:Lcn/waps/aq;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
