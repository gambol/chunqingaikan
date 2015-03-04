package cn.sharesdk.framework.utils; class k { void a() { int a;
a=0;// .class public abstract Lcn/sharesdk/framework/utils/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/sharesdk/framework/utils/Escaper;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/ThreadLocal;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ThreadLocal",
a=0;//             "<[C>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/m;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/m;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/utils/m;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/m;);
a=0;//     sput-object v0, Lcn/sharesdk/framework/utils/k;->a:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/utils/k;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static final a([CII)[C
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v0, p2, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static final b(Ljava/lang/CharSequence;II)I
a=0;//     .locals 5
a=0;// 
a=0;//     if-ge p1, p2, :cond_5
a=0;// 
a=0;//     add-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     const v2, 0xd800
a=0;// 
a=0;//     #v2=(Char);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     const v2, 0xdfff
a=0;// 
a=0;//     if-le v0, v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Char);v3=(Uninit);
a=0;//     const v2, 0xdbff
a=0;// 
a=0;//     if-gt v0, v2, :cond_4
a=0;// 
a=0;//     if-ne v1, p2, :cond_2
a=0;// 
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Char);
a=0;//     invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/lang/Character;->toCodePoint(CC)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Char);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Expected low surrogate but got char \'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' with value "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, " at index "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     :cond_4
a=0;//     #v0=(Char);v1=(Integer);v2=(Char);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Unexpected low surrogate character \'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' with value "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, " at index "
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IndexOutOfBoundsException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     const-string v1, "Index exceeds specified range"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Ljava/lang/CharSequence;II)I
a=0;//     .locals 2
a=0;// 
a=0;//     :goto_0
a=0;//     if-ge p2, p3, :cond_0
a=0;// 
a=0;//     invoke-static {p1, p2, p3}, Lcn/sharesdk/framework/utils/k;->b(Ljava/lang/CharSequence;II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/utils/k;->a(I)[C
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return p2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,[C);
a=0;//     invoke-static {v0}, Ljava/lang/Character;->isSupplementaryCodePoint(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     add-int/2addr p2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected final a(Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sget-object v0, Lcn/sharesdk/framework/utils/k;->a:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [C
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     move v0, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge p2, v5, :cond_5
a=0;// 
a=0;//     invoke-static {p1, p2, v5}, Lcn/sharesdk/framework/utils/k;->b(Ljava/lang/CharSequence;II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Trailing high surrogate at end of input"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcn/sharesdk/framework/utils/k;->a(I)[C
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[C);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     sub-int v7, p2, v3
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int v8, v0, v7
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     array-length v9, v6
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v8, v9
a=0;// 
a=0;//     array-length v9, v1
a=0;// 
a=0;//     if-ge v9, v8, :cond_1
a=0;// 
a=0;//     sub-int v9, v5, p2
a=0;// 
a=0;//     add-int/2addr v8, v9
a=0;// 
a=0;//     add-int/lit8 v8, v8, 0x20
a=0;// 
a=0;//     invoke-static {v1, v0, v8}, Lcn/sharesdk/framework/utils/k;->a([CII)[C
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     if-lez v7, :cond_2
a=0;// 
a=0;//     invoke-virtual {p1, v3, p2, v1, v0}, Ljava/lang/String;->getChars(II[CI)V
a=0;// 
a=0;//     add-int/2addr v0, v7
a=0;// 
a=0;//     :cond_2
a=0;//     array-length v3, v6
a=0;// 
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     array-length v3, v6
a=0;// 
a=0;//     invoke-static {v6, v4, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     array-length v3, v6
a=0;// 
a=0;//     add-int/2addr v0, v3
a=0;// 
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-static {v2}, Ljava/lang/Character;->isSupplementaryCodePoint(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(PosByte);
a=0;//     add-int/2addr v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, p1, v2, v5}, Lcn/sharesdk/framework/utils/k;->a(Ljava/lang/CharSequence;II)I
a=0;// 
a=0;//     move-result p2
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Boolean);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v6=(Conflicted);
a=0;//     sub-int v2, v5, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_7
a=0;// 
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     array-length v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v6, v2, :cond_6
a=0;// 
a=0;//     invoke-static {v1, v0, v2}, Lcn/sharesdk/framework/utils/k;->a([CII)[C
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_6
a=0;//     invoke-virtual {p1, v3, v5, v1, v0}, Ljava/lang/String;->getChars(II[CI)V
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :cond_7
a=0;//     #v6=(Conflicted);
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v1, v4, v0}, Ljava/lang/String;-><init>([CII)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method protected abstract a(I)[C
a=0;// .end method
a=0;// 
a=0;// .method public escape(Ljava/lang/Appendable;)Ljava/lang/Appendable;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/utils/i;->a(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/l;);
a=0;//     invoke-direct {v0, p0, p1}, Lcn/sharesdk/framework/utils/l;-><init>(Lcn/sharesdk/framework/utils/k;Ljava/lang/Appendable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/l;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public escape(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, p1, v1, v0}, Lcn/sharesdk/framework/utils/k;->a(Ljava/lang/CharSequence;II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1, v1}, Lcn/sharesdk/framework/utils/k;->a(Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
