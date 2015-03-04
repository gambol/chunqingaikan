package cn.waps; class r { void a() { int a;
a=0;// .class Lcn/waps/r;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic b:Lcn/waps/q;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/q;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/r;->b:Lcn/waps/q;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/r;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/r;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/r;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcn/waps/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/a;);
a=0;//     iget-object v1, p0, Lcn/waps/r;->b:Lcn/waps/q;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/q;);
a=0;//     iget-object v1, v1, Lcn/waps/q;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcn/waps/r;->b:Lcn/waps/q;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/q;);
a=0;//     iget-object v3, v3, Lcn/waps/q;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcn/waps/AppConnect;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/r;->b:Lcn/waps/q;
a=0;// 
a=0;//     iget-object v3, v3, Lcn/waps/q;->c:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/r;->b:Lcn/waps/q;
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/q;);
a=0;//     iget-object v4, v4, Lcn/waps/q;->d:Lcn/waps/AppListener;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Lcn/waps/a;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/widget/LinearLayout;Lcn/waps/AppListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a;);
a=0;//     invoke-virtual {v0}, Lcn/waps/a;->a()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/r;->b:Lcn/waps/q;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/q;);
a=0;//     iget-object v0, v0, Lcn/waps/q;->f:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->l(Lcn/waps/AppConnect;)Lcn/waps/AppListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/r;->b:Lcn/waps/q;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/q;->f:Lcn/waps/AppConnect;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->l(Lcn/waps/AppConnect;)Lcn/waps/AppListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AppListener;->onBannerNoData()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
