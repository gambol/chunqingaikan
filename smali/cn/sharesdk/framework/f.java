package cn.sharesdk.framework; class f { void a() { int a;
a=0;// .class Lcn/sharesdk/framework/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;// .field final synthetic b:I
a=0;// 
a=0;// .field final synthetic c:Ljava/lang/Object;
a=0;// 
a=0;// .field final synthetic d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;ILjava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/f;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/sharesdk/framework/f;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iput p3, p0, Lcn/sharesdk/framework/f;->b:I
a=0;// 
a=0;//     iput-object p4, p0, Lcn/sharesdk/framework/f;->c:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/f;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/f;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/f;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/f;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcn/sharesdk/framework/f;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, p1, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             "I",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/f;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/f;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iget v0, p0, Lcn/sharesdk/framework/f;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/f;->c:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lcn/sharesdk/framework/Platform;->afterRegister(ILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/f;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/d;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/f;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/f;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/f;->d:Lcn/sharesdk/framework/d;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
