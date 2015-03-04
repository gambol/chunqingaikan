package u.aly; class ct { void a() { int a;
a=0;// .class public Lu/aly/ct;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TField.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final a:Ljava/lang/String;
a=0;// 
a=0;// .field public final b:B
a=0;// 
a=0;// .field public final c:S
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 28
a=0;//     #v1=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1, v1}, Lu/aly/ct;-><init>(Ljava/lang/String;BS)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lu/aly/ct;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;BS)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lu/aly/ct;);
a=0;//     iput-object p1, p0, Lu/aly/ct;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 33
a=0;//     iput-byte p2, p0, Lu/aly/ct;->b:B
a=0;// 
a=0;//     .line 34
a=0;//     iput-short p3, p0, Lu/aly/ct;->c:S
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lu/aly/ct;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-byte v0, p0, Lu/aly/ct;->b:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iget-byte v1, p1, Lu/aly/ct;->b:B
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-short v0, p0, Lu/aly/ct;->c:S
a=0;// 
a=0;//     #v0=(Short);
a=0;//     iget-short v1, p1, Lu/aly/ct;->c:S
a=0;// 
a=0;//     #v1=(Short);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Short);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "<TField name:\'"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lu/aly/ct;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\' type:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-byte v1, p0, Lu/aly/ct;->b:B
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " field-id:"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-short v1, p0, Lu/aly/ct;->c:S
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ">"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
