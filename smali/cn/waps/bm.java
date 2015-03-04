package cn.waps; class bm { void a() { int a;
a=0;// .class public final Lcn/waps/bm;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field b:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic c:Lcn/waps/bh;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcn/waps/bh;Landroid/content/Context;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/bm;->c:Lcn/waps/bh;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/bm;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcn/waps/bm;->a:I
a=0;// 
a=0;//     iput p3, p0, Lcn/waps/bm;->a:I
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/bm;->b:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/waps/AppConnect;->i:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget v1, p0, Lcn/waps/bm;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/waps/AdInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/bm;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/bm;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v2, v0}, Lcn/waps/AppConnect;->clickAd(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
