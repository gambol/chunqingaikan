package cn.sharesdk.framework.network; class i { void a() { int a;
a=0;// .class Lcn/sharesdk/framework/network/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/sharesdk/framework/network/HttpResponseCallback;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/util/HashMap;
a=0;// 
a=0;// .field final synthetic b:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/sharesdk/framework/network/h;Ljava/util/HashMap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/network/i;->b:Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/sharesdk/framework/network/i;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/network/i;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onResponse(Lorg/apache/http/HttpResponse;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xc8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/16 v1, 0xc9
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/i;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "resp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosShort);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v3, "error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Throwable;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v2}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// .end method
}}
