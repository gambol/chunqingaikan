package cn.sharesdk.framework.network; class d { void a() { int a;
a=0;// .class public abstract Lcn/sharesdk/framework/network/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/network/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected abstract a()Ljava/io/InputStream;
a=0;// .end method
a=0;// 
a=0;// .method protected abstract b()J
a=0;// .end method
a=0;// 
a=0;// .method public c()Lorg/apache/http/entity/InputStreamEntity;
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/network/d;->a()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     iget v1, p0, Lcn/sharesdk/framework/network/d;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcn/sharesdk/framework/network/d;->a:I
a=0;// 
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/io/InputStream;->skip(J)J
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/network/d;->b()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v3, Lorg/apache/http/entity/InputStreamEntity;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/entity/InputStreamEntity;);
a=0;//     invoke-direct {v3, v0, v1, v2}, Lorg/apache/http/entity/InputStreamEntity;-><init>(Ljava/io/InputStream;J)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/entity/InputStreamEntity;);
a=0;//     return-object v3
a=0;// .end method
}}
