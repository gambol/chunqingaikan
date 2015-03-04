package cn.sharesdk.framework.utils; class l { void a() { int a;
a=0;// .class Lcn/sharesdk/framework/utils/l;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Appendable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field b:[C
a=0;// 
a=0;// .field final synthetic c:Ljava/lang/Appendable;
a=0;// 
a=0;// .field final synthetic d:Lcn/sharesdk/framework/utils/k;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/sharesdk/framework/utils/k;Ljava/lang/Appendable;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/utils/l;->d:Lcn/sharesdk/framework/utils/k;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/sharesdk/framework/utils/l;->c:Ljava/lang/Appendable;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/utils/l;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/utils/l;->b:[C
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a([CI)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     if-ge v0, p2, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/utils/l;->c:Ljava/lang/Appendable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Appendable;);
a=0;//     aget-char v2, p1, v0
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-interface {v1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public append(C)Ljava/lang/Appendable;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iget v0, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v2, :cond_2
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Character;->isLowSurrogate(C)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Expected low surrogate character but got \'"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\' with value "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Byte);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/l;->d:Lcn/sharesdk/framework/utils/k;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/k;);
a=0;//     iget v1, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-char v1, v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-static {v1, p1}, Ljava/lang/Character;->toCodePoint(CC)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/utils/k;->a(I)[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcn/sharesdk/framework/utils/l;->a([CI)V
a=0;// 
a=0;//     :goto_0
a=0;//     iput v2, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,[C);v1=(Integer);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/l;->c:Ljava/lang/Appendable;
a=0;// 
a=0;//     iget v1, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     int-to-char v1, v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-interface {v0, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/l;->c:Ljava/lang/Appendable;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-static {p1}, Ljava/lang/Character;->isHighSurrogate(C)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iput p1, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-static {p1}, Ljava/lang/Character;->isLowSurrogate(C)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Unexpected low surrogate character \'"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\' with value "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Byte);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/l;->d:Lcn/sharesdk/framework/utils/k;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/k;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/k;->a(I)[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v1}, Lcn/sharesdk/framework/utils/l;->a([CI)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/l;->c:Ljava/lang/Appendable;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, p1, v0, v1}, Lcn/sharesdk/framework/utils/l;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Appendable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ge p2, p3, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v4, :cond_8
a=0;// 
a=0;//     add-int/lit8 v0, p2, 0x1
a=0;// 
a=0;//     invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Expected low surrogate character but got "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Char);v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/utils/l;->d:Lcn/sharesdk/framework/utils/k;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/utils/k;);
a=0;//     iget v3, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-char v3, v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-static {v3, v1}, Ljava/lang/Character;->toCodePoint(CC)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Lcn/sharesdk/framework/utils/k;->a(I)[C
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v1, v2}, Lcn/sharesdk/framework/utils/l;->a([CI)V
a=0;// 
a=0;//     add-int/lit8 p2, p2, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     iput v4, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/utils/l;->d:Lcn/sharesdk/framework/utils/k;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/k;);
a=0;//     invoke-virtual {v1, p1, v0, p3}, Lcn/sharesdk/framework/utils/k;->a(Ljava/lang/CharSequence;II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, p2, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/l;->c:Ljava/lang/Appendable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Appendable;);
a=0;//     invoke-interface {v0, p1, p2, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     if-ne v1, p3, :cond_4
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Reference,[C);v2=(Reference,Lcn/sharesdk/framework/utils/k;);v3=(Char);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/utils/l;->c:Ljava/lang/Appendable;
a=0;// 
a=0;//     iget v2, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-char v2, v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-interface {v1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {p1, v1, p3}, Lcn/sharesdk/framework/utils/k;->b(Ljava/lang/CharSequence;II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_5
a=0;// 
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     iput v0, p0, Lcn/sharesdk/framework/utils/l;->a:I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/utils/l;->d:Lcn/sharesdk/framework/utils/k;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/utils/k;);
a=0;//     invoke-virtual {v2, v0}, Lcn/sharesdk/framework/utils/k;->a(I)[C
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0, v2, v3}, Lcn/sharesdk/framework/utils/l;->a([CI)V
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v0}, Ljava/lang/Character;->isSupplementaryCodePoint(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(PosByte);
a=0;//     add-int p2, v1, v0
a=0;// 
a=0;//     move v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Reference,[C);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/utils/l;->b:[C
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v0, v2, v3}, Ljava/lang/Character;->toChars(I[CI)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/utils/l;->b:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     invoke-direct {p0, v3, v2}, Lcn/sharesdk/framework/utils/l;->a([CI)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     move v0, p2
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
