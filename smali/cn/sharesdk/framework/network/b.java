package cn.sharesdk.framework.network; class b { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/network/b;
a=0;// .super Lcn/sharesdk/framework/network/d;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/network/d;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/network/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a([B)Lcn/sharesdk/framework/network/b;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/a;);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, v1}, Lcn/sharesdk/framework/network/a;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/a;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/network/a;->write([B)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/network/a;->flush()V
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected a()Ljava/io/InputStream;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     new-array v1, v3, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/network/a;->a()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/network/a;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     new-array v1, v3, [B
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/network/a;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/network/a;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v3, v2}, Ljava/io/ByteArrayInputStream;-><init>([BII)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected b()J
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/a;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/network/a;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/a;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/network/a;->a()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/network/b;->a:Lcn/sharesdk/framework/network/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/network/a;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/network/a;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v0, v2}, Lcn/sharesdk/framework/utils/a;->a([BII)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
