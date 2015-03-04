package cn.sharesdk.framework.statistics.b; class e { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/statistics/b/e;
a=0;// .super Lcn/sharesdk/framework/statistics/b/c;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:I
a=0;// 
a=0;// .field private static c:J
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/b/c;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/statistics/b/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "[EXT]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected a(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput-wide p1, Lcn/sharesdk/framework/statistics/b/e;->c:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/statistics/a/c;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/c;);
a=0;//     const-string v1, "insertExitEventCount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/statistics/a/c;->c(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sput v1, Lcn/sharesdk/framework/statistics/b/e;->b:I
a=0;// 
a=0;//     const-string v1, "lastInsertExitEventTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/statistics/a/c;->b(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcn/sharesdk/framework/statistics/b/e;->c:J
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcn/sharesdk/framework/statistics/b/c;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected b()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x1388
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcn/sharesdk/framework/statistics/b/c;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/statistics/a/c;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/c;);
a=0;//     const-string v1, "lastInsertExitEventTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-wide v2, Lcn/sharesdk/framework/statistics/b/e;->c:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/sharesdk/framework/statistics/a/c;->a(Ljava/lang/String;Ljava/lang/Long;)V
a=0;// 
a=0;//     const-string v1, "insertExitEventCount"
a=0;// 
a=0;//     sget v2, Lcn/sharesdk/framework/statistics/b/e;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/sharesdk/framework/statistics/a/c;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected c()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected d()J
a=0;//     .locals 2
a=0;// 
a=0;//     sget v0, Lcn/sharesdk/framework/statistics/b/e;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method protected e()J
a=0;//     .locals 2
a=0;// 
a=0;//     sget-wide v0, Lcn/sharesdk/framework/statistics/b/e;->c:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method protected f()V
a=0;//     .locals 1
a=0;// 
a=0;//     sget v0, Lcn/sharesdk/framework/statistics/b/e;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     sput v0, Lcn/sharesdk/framework/statistics/b/e;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/16 v2, 0x7c
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-super {p0}, Lcn/sharesdk/framework/statistics/b/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/b/e;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/b/e;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-wide v2, p0, Lcn/sharesdk/framework/statistics/b/e;->a:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
