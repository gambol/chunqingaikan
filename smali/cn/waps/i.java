package cn.waps; class i { void a() { int a;
a=0;// .class Lcn/waps/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic b:Lcn/waps/AppConnect;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/AppConnect;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/i;->b:Lcn/waps/AppConnect;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/i;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/i;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 5
a=0;// 
a=0;//     new-instance v0, Lcn/waps/at;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/at;);
a=0;//     invoke-direct {v0}, Lcn/waps/at;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/at;);
a=0;//     iget-object v1, p0, Lcn/waps/i;->b:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/AppConnect;);
a=0;//     iget-object v1, v1, Lcn/waps/AppConnect;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/i;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v4, p0, Lcn/waps/i;->b:Lcn/waps/AppConnect;
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/AppConnect;);
a=0;//     iget-object v4, v4, Lcn/waps/AppConnect;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v3, v4}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v3}, Lcn/waps/SDKUtils;->getAppName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcn/waps/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->a(Z)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
