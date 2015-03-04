package cn.sharesdk.framework.authorize; class i { void a() { int a;
a=0;// .class Lcn/sharesdk/framework/authorize/i;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/sharesdk/framework/authorize/h;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/sharesdk/framework/authorize/h;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/authorize/i;->a:Lcn/sharesdk/framework/authorize/h;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/authorize/i;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/app/Instrumentation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Instrumentation;);
a=0;//     invoke-direct {v0}, Landroid/app/Instrumentation;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Instrumentation;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Instrumentation;->sendKeyDownUpSync(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/i;->a:Lcn/sharesdk/framework/authorize/h;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/authorize/h;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     invoke-interface {v0}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getAuthorizeListener()Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onCancel()V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/i;->a:Lcn/sharesdk/framework/authorize/h;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/authorize/h;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/g;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
