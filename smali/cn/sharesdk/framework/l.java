package cn.sharesdk.framework; class l { void a() { int a;
a=0;// .class public abstract Lcn/sharesdk/framework/l;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Handler$Callback;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final a:Landroid/os/Handler;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/l;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/l;->b:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     invoke-direct {v0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v1, p0, Lcn/sharesdk/framework/l;->a:Landroid/os/Handler;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v1, v1, v0}, Lcn/sharesdk/framework/l;->a(IILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(IILjava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput p1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput p2, v0, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     iput-object p3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/l;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected a(Landroid/os/Message;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v1, v1, v0}, Lcn/sharesdk/framework/l;->b(IILjava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(IILjava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput p1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iput p2, v0, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     iput-object p3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/l;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b(Landroid/os/Message;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract c(Landroid/os/Message;)V
a=0;// .end method
a=0;// 
a=0;// .method public final handleMessage(Landroid/os/Message;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/sharesdk/framework/l;->c(Landroid/os/Message;)V
a=0;// 
a=0;//     :goto_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1}, Lcn/sharesdk/framework/l;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     invoke-virtual {p0, p1}, Lcn/sharesdk/framework/l;->b(Landroid/os/Message;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x2
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
